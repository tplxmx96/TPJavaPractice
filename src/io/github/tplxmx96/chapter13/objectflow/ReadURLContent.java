package io.github.tplxmx96.chapter13.objectflow;

import io.github.tplxmx96.chapter13.Reader.ReplaceLyriceDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 从给定的url上读取文件内容 - 暂时只支持http协议
 */
public class ReadURLContent {
    static final String FilePath = "src/io/github/tplxmx96/chapter13/Reader/163.txt";
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.163.com/index.html");
        //将InputStream转换成Reader的套路：使用装饰器类
        StringBuffer content = new StringBuffer();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line = null;
            while ((line = reader.readLine()) != null){
                content.append(line);
                content.append(System.getProperty("line.separator"));
            }
            ReplaceLyriceDemo.WriterFileByPrintWriter(content.toString(),FilePath,false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
