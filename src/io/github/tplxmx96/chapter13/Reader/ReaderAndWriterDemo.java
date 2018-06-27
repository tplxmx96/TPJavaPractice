package io.github.tplxmx96.chapter13.Reader;

import sun.swing.FilePane;

import java.io.*;

public class ReaderAndWriterDemo {
    private static final String FilePath1 = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    private static final String FilePath2 = "src/io/github/tplxmx96/chapter13/FileDemo.java";

    public static void main(String[] args){
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(FilePath1));
            //固定的读取格式
            String line = null;
            while ((line = bReader.readLine())!=null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //要写入的字符串
        String content = "package io.github.tplxmx96.chapter13.Reader;\n";
        content +="//本类由代码自动生成\n";
        content +="public calss FileDemo3{\n";
        content +="\tpublic static void main(String[] args){\n";
        content +="\t\tSystem.out.println(\"Hello World!\");\n\t}\n}";
        try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(FilePath2));){
            //使用了jdk7以后新增的自动关闭资源的写法
            //使用前提：资源类必须实现Closeble接口
            bWriter.write(content);//将字符串写入到缓冲中
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            //由于bWriter.close会抛出IOException。这里的异常就被新结构抑制了
            //以下的代码用来查看被抑制的异常信息
            if (e.getSuppressed() !=null){
                Throwable[] throwables = e.getSuppressed();
                for (Throwable t : throwables){
                    System.out.println(t.getMessage()+"cased by"+t.getClass().getSimpleName());
                }
            }
        }

    }
}
