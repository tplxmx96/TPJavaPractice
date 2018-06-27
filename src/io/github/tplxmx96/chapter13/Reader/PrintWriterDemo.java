package io.github.tplxmx96.chapter13.Reader;

import io.github.tplxmx96.chapter10.rpgdemo.Warrior;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * PrintWriter和PrintStream
 * printWriter用来处理字符流，一次写入2个字节：PrintStream用来处理字节流，一次写人一个字节
 * 建议：在处理文本文件时，使用PrintWriter
 */
public class PrintWriterDemo {
    static final String FilePath= "src/io/github/tplxmx96/chapter13/FileDemo.java";
    public static void main(String[] args){
        //补充：关于Java中的分隔符 Windows - \r\n
        String separator = System.getProperty("line.separator");//获得系统默认的分隔符 - 固定写法
        String content = "package io.github.tplxmx96.chapter13;"+separator;
        content += "public class FileDemo{"+ separator;
        content += "public static void main(String[] args){"+separator;
        content += "\t\tSystem.out.println(\"HelloWorld!\");" + separator;
        content +="\t}"+separator;
        content +="}";
        try(PrintWriter writer = new PrintWriter(new File(FilePath))){
            writer.write(content);
            System.out.println("写入成功");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try(Scanner input = new Scanner(new File(FilePath))){
            StringBuffer value = new StringBuffer();

            while (input.hasNextLine()){
                value.append(input.nextLine());
                value.append(separator);

            }
            System.out.println("以下是从文件中读取出的内容：");
            System.out.println(value.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
