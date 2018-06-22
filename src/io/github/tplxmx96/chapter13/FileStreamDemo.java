package io.github.tplxmx96.chapter13;

import java.io.*;

/**
 * 演示文件输入、输出流的基本用法
 */
public class FileStreamDemo {
    private static final String FolePath = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    public static void main(String[] args) throws IOException {
        File file = new File(FolePath);
        InputStream inputStream = new FileInputStream(file);
//        inputStream.available() 获得输入流可以读取的文件大小(字节)
        //读取文件的基本操作 - 相当比较固定
        byte[] bytes = new byte[20000];
        int count = 0;
        while ((bytes[count] = (byte) inputStream.read()) != -1){
            count++;
        }
        String content = new String(bytes);//将读取出的字节数组转换成字符串，以便打印
        System.out.println(content);

    }
}
