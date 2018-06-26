package io.github.tplxmx96.chapter13.Buffered;

import sun.swing.FilePane;

import java.io.*;

public class BufferedStreamTset {
    /**
     * 注意：本地文件测试，一定记得将文件路径修改成自己电脑中的路径！
     */
    private static final String FilePath1 = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    private static final String FilePath2 = "src/io/github/tplxmx96/chapter13/已复制文件.java";

    public static void main(String[] args)throws Exception{
//        //使用缓冲流装饰系统的输入流对象
//        BufferedInputStream inSream = new BufferedInputStream(System.in);
//        byte[] bytes = new byte[200];
//        System.out.println("请输入字符串：");
//        inSream.read(bytes);
//        System.out.println("用户输入的字符串是：" + new String(bytes));
        long time = CopyFileByBufferedStream();
        System.out.println("拷贝用时："+time+"毫秒");
    }
    /**
     * 使用缓存流拷贝文件
     * @return 拷贝过程的用时(毫秒)
     */

    private static long CopyFileByBufferedStream(){
        File file = new File(FilePath1);//要复制的文件
        if (!file.exists()){
           System.out.println("文件不存在，复制失败！");
           return 0;
        }
        long starTime = System.currentTimeMillis();
        InputStream inStream = null;
        BufferedInputStream bInStream = null;
        OutputStream outSream = null;
        BufferedOutputStream bOutStream = null;
        try{
            inStream = new FileInputStream(file);
            bInStream = new BufferedInputStream(inStream);
            outSream = new FileOutputStream(FilePath2);
            bOutStream = new BufferedOutputStream(outSream);
            int i = -1;//读取出的临时变量
            while ((i = bInStream.read()) !=-1){
                bOutStream.write(i);
                //注意：读取一个字节，就写入到了缓存中！需要在最后，将缓存中的内容写入到文件中！
                //即，需要清空缓冲区，将缓冲区的内容写到文件中 - flush
            }
            System.out.println("文件复制成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
//                bOutStream.flush();
                bOutStream.close();//可以直接调用close方法，内部已经帮我们自动调用了flush方法
                outSream.close();
                bInStream.close();
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        long endTome = System.currentTimeMillis();
        return endTome - starTime;
    }
}
