package io.github.tplxmx96.chapter13.Buffered;

import java.io.BufferedInputStream;

public class BufferedStreamTset {
    public static void main(String[] args)throws Exception{
        //使用缓冲流装饰系统的输入流对象
        BufferedInputStream inSream = new BufferedInputStream(System.in);
        byte[] bytes = new byte[200];
        System.out.println("请输入字符串：");
        inSream.read(bytes);
        System.out.println("用户输入的字符串是：" + new String(bytes));
    }
}
