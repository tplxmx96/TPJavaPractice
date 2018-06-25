package io.github.tplxmx96.network.TCP;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {
    public static void main(String[] args)throws Exception{
        ServerSocket ss = new ServerSocket(10005);

        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+".....connected");
        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf,0,len));

        OutputStream out = s.getOutputStream();

        Thread.sleep(10000);
        out.write("哥们收到，你也好".getBytes());

        s.close();
        ss.close();
    }
}
