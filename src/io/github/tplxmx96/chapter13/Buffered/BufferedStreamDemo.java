package io.github.tplxmx96.chapter13.Buffered;

import java.io.*;

/**
 * 使用带缓冲的流增加读写效率
 */
public class BufferedStreamDemo {
    static final String FilePath1 = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    static final String FilePath2 = "src/io/github/tplxmx96/chapter13/Buffter.txt";

    public static void main(String[] args){
        FileInputStream fInputStream = null;
        BufferedInputStream bInputStream = null;
        try {
            fInputStream = new FileInputStream(FilePath1);
            bInputStream = new BufferedInputStream(fInputStream);
            byte[] bytes = new byte[bInputStream.available()];
            bInputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bInputStream.close();
                fInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedOutputStream bOutStream = null;
        try {
            bOutStream = new BufferedOutputStream(new FileOutputStream(FilePath2),102400);
            bOutStream.write("今天天气很好！".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bOutStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
