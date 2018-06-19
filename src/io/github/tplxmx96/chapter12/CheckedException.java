package io.github.tplxmx96.chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 必检异常 - 除了RunTimeException和Error的其他类的子类
 */
public class CheckedException {
    public static void main(String[] args){
        File file = new File("c:/test.txt");
        try {
            FileWriter writer = new FileWriter(file);//文件的写人器，用来将内容写入到文件中
        } catch (IOException e) {
            //一般在开发的时候使用
            e.printStackTrace();
//            System.err.println(e.getMessage());
        }
        //判断这个文件是否存在
        System.out.println(file.exists());
    }
}
