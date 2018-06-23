package io.github.tplxmx96.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSece2 {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds = new DatagramSocket();

        BufferedReader bufr =
                new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while (((line=bufr.readLine()))!=null){
            if ("888".equals(line))
                break;
            byte[] buf = line.getBytes();

            DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.5.22"),10001);

            ds.send(dp);
        }
        ds.close();
    }
}
