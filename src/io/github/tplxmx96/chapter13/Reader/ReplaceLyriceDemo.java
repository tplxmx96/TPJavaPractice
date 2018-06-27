package io.github.tplxmx96.chapter13.Reader;

import java.io.*;

/**
 * 修改歌词中的内容
 */
public class ReplaceLyriceDemo {
    //注意：这里的dat后缀名是随便起的！
    static final String FilePath ="src/io/github/tplxmx96/chapter13/Reader/lyric.dat";

    /**
     * 字符流
     * 将读取文件的操作封装在方法中，方便以后的使用
     * @param filePath
     * @return
     */
    public static String ReadFileByReader(String filePath){
        StringBuffer content = new StringBuffer();
        Reader reader = null;
        BufferedReader bReader = null;
        try {
            reader = new FileReader(filePath);
            bReader = new BufferedReader(reader);
            String line = null;
            while ((line=bReader.readLine()) !=null){
                content.append(line);
                content.append(System.getProperty("line.separator"));//拼接一个系统默认的分隔符win-\r\n

            }
            //删除最后的系统分隔符
            content.delete(content.toString().lastIndexOf(System.getProperty("line.separator")),content.toString().length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bReader.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return content.toString();
    }

    /**
     * 使用PrintWriter对象实现写入文件
     * Scanner跟PrinterWriter是一对
     * 优点：代码简洁
     * @param filePath
     * @param isAppend
     */
    public static void WriterFileByPrintWriter(String content,String filePath,boolean isAppend){
        try(//jdk1.7以后的写法，可以自动关闭打开的资源！
                FileOutputStream outStream = new FileOutputStream(filePath,isAppend);
            PrintWriter writer = new PrintWriter(outStream)
        ){
            writer.print(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
        //调用方法获得文件中的所有内容
        String contnent = ReadFileByReader(FilePath);
        //调用方法，将content字符串写入到文件中
        WriterFileByPrintWriter(contnent,FilePath,true);
    }


//    public static void main(String[] args){
//        //使用字符流进行操作
//        Reader reader = null;
//        BufferedReader bReader = null;
//        Writer writer = null;
//        BufferedWriter bWriter = null;
//        StringBuffer lyric = new StringBuffer();
//        try {
//            reader = new FileReader(FilePath);
//            bReader = new BufferedReader(reader);
//            String line = null;
//            while ((line=bReader.readLine()) !=null){
//                lyric.append(line);
//                lyric.append(System.getProperty("line.separator"));//拼接一个系统默认的分隔符win-\r\n
//
//            }
//            String newLyric = lyric.toString().replaceAll("(女)","女:").replaceAll("男","男:");
//            //将歌词写入文件
//            writer = new FileWriter(FilePath);
//            bWriter = new BufferedWriter(writer);
//            bWriter.write(newLyric);
//            System.out.println("已替换成功!");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bReader.close();
//                reader.close();
////                bWriter.flush();
//                bWriter.close();
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
