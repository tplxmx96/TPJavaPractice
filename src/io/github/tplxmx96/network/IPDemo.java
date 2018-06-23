package io.github.tplxmx96.network;

import java.net.InetAddress;


public class IPDemo {
    public static void main(String[] args) throws Exception {
        InetAddress i = InetAddress.getLocalHost();

        System.out.println(i.toString());
        System.out.println("address:"+ i.getHostAddress());
        System.out.println("name:" + i.getHostName());

        InetAddress ia = InetAddress.getByName("www.baidu.com");
        System.out.println("address:"+ ia.getHostAddress());
        System.out.println("name:" + ia.getHostName());

    }
}
