package io.github.tplxmx96.network.chatting;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ChatDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket sendSocket = new DatagramSocket();
        DatagramSocket receSocket = new DatagramSocket(10002);

        new Thread(new Send(sendSocket)).start();
        new Thread(new Rece(receSocket)).start();
    }
}

