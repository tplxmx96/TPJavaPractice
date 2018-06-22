package io.github.tplxmx96.chapter13;

import javax.swing.plaf.PanelUI;
import java.io.*;

/**
 * 演示文件输入、输出流的基本用法
 * 注意:目前的读写方法还比较原始，建议在这里熟悉InputTream/OutputTream的一些重用方法即可
 * 后续会有一些高级的类对读写方法进行升级和扩展
 */
public class FileStreamDemo {
    private static final String FolePath = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    public static void main(String[] args) throws IOException {
//        ReadFile();
        writeFile();
    }
    public static void writeFile() throws IOException {
        //注意：此文件默认不存在
        final String FilePath1 = "src/io/github/tplxmx96/chapter13/FileDemo2.java";
        OutputStream outputStream = new FileOutputStream(FilePath1,false);//第二个参数 是否追加写人
        String content = "package io.github.tplxmx96.chapter13;\n";
        content += "public class FileDemo2{\n";
        content += "public static void main(String[] args){\n";
        content += "System.out.println(\"Hello wold!\");\n}\n}";
        outputStream.write(content.getBytes());//核心语句：将字符串转换成字节数组，写人到文件中
        //写入完毕后一定记得关闭打开的资源
        outputStream.close();
    }
    public static void ReadFile() throws IOException {
        File file = new File(FolePath);
        InputStream inputStream = new FileInputStream(file);
//        inputStream.available() 获得输入流可以读取的文件大小(字节)
        //读取文件的基本操作 - 相当比较固定
        byte[] bytes = new byte[20000];
        inputStream.read(bytes);
//        int count = 0;
//        while ((bytes[count] = (byte) inputStream.read()) != -1){
//            count++;
//        }
        String content = new String(bytes);//将读取出的字节数组转换成字符串，以便打印
        System.out.println(content);
        inputStream.close();
    }
}
