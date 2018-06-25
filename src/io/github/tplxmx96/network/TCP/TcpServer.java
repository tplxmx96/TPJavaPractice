package io.github.tplxmx96.network.TCP;

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
 * 4、关闭服务端。
 */
public class TcpDemo {
    public static void main(String[] args){

    }
}
