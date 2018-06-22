package io.github.tplxmx96.chapter13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用带缓冲的流增加读写效率
 */
public class BufferedStreamDemo {
    static final String FilePath = "src/io/github/tplxmx96/chapter13/FileStreamDemo.java";

    public static void main(String[] args){
        FileInputStream fInputStream = null;
        BufferedInputStream bInputStream = null;
        try {
            fInputStream = new FileInputStream(FilePath);
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
    }
}
