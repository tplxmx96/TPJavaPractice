package io.github.tplxmx96.network.TCP;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需求：定义端点接收数据并打印在控制台上
 *
 * 服务端：
 * 1、建立服务端的socket服务。ServerSocket();
 * 并监听一个端口。
 * 2、获取连接过来的客户端对象。
 * 通过ServerSocket的accept方法，没有连接就会等，所以这个方法是阻塞式的。
 * 3、客服端如果发过来数据，那么服务端要使用对应的客服端对象，并获取到该客服端对象的读取流来读取发过来的数据。
 * 并打印在控制台。
 * 4、关闭服务端。(可选)
 */
public class TcpServer {
    public static void main(String[] args)throws Exception{
        //建立服务端socket服务，并监听一个端口。
        ServerSocket ss = new ServerSocket(10004);

        //通过accept方法获取连接过来的客服端对象。
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+".....connected");

        //获取客服端发送过来的数据，那么要使用客服端对象的读取流来读取数据。
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);

        System.out.println(new String(buf,0,len));

        s.close();//关闭客服端
        ss.close();//关闭服务端




    }
}
