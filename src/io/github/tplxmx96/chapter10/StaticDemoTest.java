package io.github.tplxmx96.chapter10;

public class StaticDemoTest {
    public static void main(String[] args){
        StaticDemo staticDemo1 = StaticDemo.getInstance();
        System.out.println(staticDemo1.static_number);

        StaticDemo staticDemo2 = StaticDemo.getInstance();
        staticDemo2.normal_number = 1024;

        StaticDemo staticDemo3 = StaticDemo.getInstance();
        System.out.println(staticDemo3.normal_number);

        System.out.println(staticDemo1 == staticDemo2);
    }
}
