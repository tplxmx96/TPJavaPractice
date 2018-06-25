package io.github.tplxmx96.network.TCP;

/**
 * 演示tcp传输
 * 1、tcp分客服端对应的对象是Socket.
 * 2、服务端对应的对象是Socket
 */

import java.io.OutputStream;
import java.net.Socket;

/**
 * 客服端
 * 通过查阅socket对象，发现在该对象建立时，就可以去连接指定主机。
 * 因为tcp是面向连接的，使用在建立socket服务时，
 * 就要有服务器存在，并连接成功，形成通落后，在该通道进行数据的传输。
 *
 * 需求：给服务端发送一个文本数据
 * 步骤
 * 1、创建socket服务，并指定要连接的主机和端口。
 */
public class TcpClient {
    public static void main(String[] args) throws Exception {
        //创建客服端的socket服务，指定目的的主机和端口
        Socket s = new Socket("192.168.5.83",10004);

        //为了发送数据，应该获取socket流中的输出流
        OutputStream out = s.getOutputStream();

        out.write("tcp ge men lai le".getBytes());

        s.close();

    }
}
