package io.github.tplxmx96.chapter13.Reader;

import java.io.IOException;

public class CloseableDemo {
//    public static void main(String[] args){
//        try(SomeResrouce some =new SomeResrouce()){
//            throw new IOException("手动抛出");
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
}

/**
 * 我们自定义的模拟资源类(有可能是连接、文件流）
 * 实现Closeable接口，以便让try()自动进行关闭资源
 */
class SomeResrouce implements Cloneable{
    public void close() throws IOException{
        System.out.println("打开的SomeResrouce资源已被关闭！");

    }
}
