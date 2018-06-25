package io.github.tplxmx96.network.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * 编写一个聊天软件
 * 有收数据的部分，和发数据的部分。。
 * 这两部分需要同时执行。
 * 那就需要用到多线程技术。
 * 一个线程控制收，一个线程控制发。
 *
 * 因为收和发动作是不一致的，所以要定义厉害run方法
 * 而且这两个方法要封装到不同的类中。
 */
public class Send implements Runnable {
    private DatagramSocket ds;
    public Send(DatagramSocket ds){
        this.ds = ds;
    }

    public void run(){
        try{
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while((line=bufr.readLine())!=null){
                if ("886".equals(line))
                    break;

                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.5.21"),10002);
            }
        }catch (Exception e){
            throw new RuntimeException("发送端失败");
        }
    }
}

