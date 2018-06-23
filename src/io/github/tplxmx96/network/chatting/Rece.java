package io.github.tplxmx96.network.chatting;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Rece implements Runnable{
    private DatagramSocket ds;
    public Rece(DatagramSocket ds){
        this.ds = ds;
    }

    public void run(){
        try{
            while (true){
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf,buf.length);

                ds.receive(dp);

                String ip = dp.getAddress().getHostAddress();
                String data = new String(dp.getData(),0,dp.getLength());
                System.out.println(ip+":"+data);
            }
        } catch (IOException e) {
            throw new RuntimeException("接收 端失败");
        }
    }
}
