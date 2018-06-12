package io.github.tplxmx96.chapter10.rpgdemo;

public class HeroTest {
    public static void main(String[] args){
        //Hero 韩信 = new Warrior();
        Hero 韩信;            //声明了一个Hero类型的变量 韩信
        韩信 = new Warrior(); //在堆内存中分配了空间(同时调用子类构造进行初始化)，将地址赋给了韩信变量
        韩信.move();


        //问题：对象 韩信 的类型是什么？

    }
}
