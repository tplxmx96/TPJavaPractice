package io.github.tplxmx96;

import io.github.tplxmx96.collection.MapTest;
import io.github.tplxmx96.datatype.TypeTest;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");

        //测试基础数据类型
        TypeTest typeTest = new TypeTest(1,true,.2f,22.2,22l,"测试数据类型");
        System.out.println(typeTest.toString());

        //测试键值对（key-value）的map
        MapTest mapTest = new MapTest();
        mapTest.testAdd().iteratorPrint();

    }
}
