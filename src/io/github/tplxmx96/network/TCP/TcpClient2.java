package io.github.tplxmx96.network.TCP;

/**
 * 演示tcp的传输的客户端和服务端的互访
 *
 * 需求：客户端给服务端发送数据，服务端收到后，给客户端反馈信息。
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客服端：
 * 1、建立socket服务，指定要连接主机和端口。
 * 2、获取socket流中的输出流，将数据写到该流中，通过网络发送给服务端。
 * 3、获取socket流中的输入流，就服务端反馈的数据获取到，并打印。
 * 4、关闭客户端资源。
 */
public class TcpClient2 {
    public static void main(String[] args)throws Exception{
        Socket s = new Socket("192.168.5.83",10005);

        OutputStream out = s.getOutputStream();

        out.write("服务端，你好".getBytes());

        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);

        System.out.println(new String(buf,0,len));

        s.close();

    }
}
