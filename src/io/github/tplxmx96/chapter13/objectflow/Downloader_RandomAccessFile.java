package io.github.tplxmx96.chapter13.objectflow;

import com.sun.org.apache.regexp.internal.RE;
import org.omg.CORBA.INTERNAL;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *1、从HTTP协议下载文件(文件流)，将文件流以缓冲流的方法读取到内存中
 *       InputStream -> BufferedInputStream
 *2、将缓存中数据分块写入到硬盘上（使用RandomAccessFile类实现）
 */
public class Downloader_RandomAccessFile {
    /**  要下载的网址(爱奇艺电影羞羞的铁拳) 演示 */
    private static final String StrUrl = "http://www.iqiyi.com/v_19rr7pmvcw.html#vfrm=2-4-0-1";
    /**  设置下载时的默认缓存大小 - 1M大小/10K大小 */
    private static final int MAX_BUFFER_SIZE = 1024000;

    public static void main1(String[] args) throws MalformedURLException {
        URL url = new URL(StrUrl);
        System.out.println(url.getFile());
    }



    public static void main(String[] args){
        //1、打开http连接，获得下载内容的长度（补充内容，但是格式相对固定）
        //2、创建RandomAccessFile对象
        //3、将下载的内容缓存到字节数组中
        //4、将缓存字节数组通过randomAccessFile对象写入到文件中(涉及到一个文件指针的操作)
        HttpURLConnection connection = null;
        BufferedInputStream bInStream = null;
        try {
            URL url = new URL(StrUrl);   //创建url对象，以便获得文件流
            connection = (HttpURLConnection) url.openConnection();
            //设置连接属性 - range指从服务器请求下载文件的字节数范围，0-   表示不指定终止字节数
            connection.setRequestProperty("Range","bytes=0-");
            connection.connect(); //连接到了服务器
            //判断连接是否成功 - 一般连接成功后，返回的代码应该在200的范围内
            //1xx：指示信息，表示请求已被接收，继续操作。
            //2xx：成功，表示请求已被成功接收，理解，操作。
            //3xx：重定向，要求完成请求必须进行进一步的操作。
            //4xx：客户端错误，请求有语法错误或请求无法实现。
            //5xx：服务器错误，服务器未能实现合法请求。
            if (connection.getResponseCode() / 100 != 2){
                System.out.println("连接的响应状态不在200范围内，连接错误，请重试！");
                return;
            }
            int fileSize = connection.getContentLength();  //获得要下载文件的大小(字节数)
            bInStream = new BufferedInputStream(connection.getInputStream(),MAX_BUFFER_SIZE);
            int downloaded = 0; //已下载的字节数 - 用来计算当前下载的百分比
            String fileName = url.getFile(); //获得下载的文件名 - /video/xuetang9_intro.mp4
            //截图字符串，从最后一个斜线+1的位置开始截取
            fileName = fileName.substring(fileName.lastIndexOf("/") +1);
            RandomAccessFile file = new RandomAccessFile(fileName,"rw");
            file.setLength(0); //文件清空
            file.seek(0); //将文件指针置零
            while (downloaded < fileSize){ //当前以下载的字节数小于文件总大小时，继续下载
                byte[] buffer = null; // 下载缓存字节数组
                //判断未下载的大小是否超过最大缓存数
                if (fileSize - downloaded > MAX_BUFFER_SIZE){
                    buffer = new byte[MAX_BUFFER_SIZE];
                }else {
                    buffer = new byte[fileSize - downloaded];
                }
                //将缓冲中的内容读取出来
                int read = bInStream.read(buffer);
                if (read == -1)break;  //下载完毕
                //将当前下载的缓存写入到文件中
                file.seek(downloaded); //设置文件指针
                file.write(buffer,0,read);
                downloaded += read;
                System.out.println("当前下载进度：" + downloaded * 1.0 / fileSize * 10000 / 100 + "%");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
            try {
                bInStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
