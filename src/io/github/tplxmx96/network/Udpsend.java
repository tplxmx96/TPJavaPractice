package io.github.tplxmx96.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 需求：通过udp传输方式，将一段文字数据发送出去
 * 定义一个udp发送端
 * 思路：
 * 1、建立udpsocket服务。
 * 2、提供数据，并将数据封装到数据包中。
 * 3、通过socket服务的发送功能，将数据包发出去。
 * 4、关闭资源。
 */
public class Udpsend {
    public static void main(String[] args) throws Exception {
        //1、创建udp服务，通过DatagramSocket对象。
        DatagramSocket ds = new DatagramSocket(8888);

        //2、确定数据，并封装成数据包。
        byte[] buf = "udp ge men lai le".getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.5.22"),10000);

        //3、通过socket服务，将已有的数据包发送出去，通过send方法。
        ds.send(dp);

        //4、关闭资源
        ds.close();
    }
}

