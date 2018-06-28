package io.github.tplxmx96.chapter13.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 从给定的url上读取文件内容 - 暂时只支持http协议
 */
public class ReadURLContent {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.163.com/index.html");
        //将InputStream转换成Reader的套路：使用装饰器类
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
