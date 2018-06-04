package io.github.tplxmx96;

import io.github.tplxmx96.Javaobjectexercise.Role;
import io.github.tplxmx96.collection.ListPojoTest;
import io.github.tplxmx96.collection.ListTest;
import io.github.tplxmx96.collection.MapTest;
import io.github.tplxmx96.datatype.TypeTest;

import java.util.List;

public class Main {
    public static void main(String[] args){
 //       System.out.println("hello world");

        //测试基础数据类型
//        TypeTest typeTest = new TypeTest(1,true,.2f,22.2,22l,"测试数据类型");
       // System.out.println(typeTest.toString());

        //测试键值对（key-value）的map
//        MapTest mapTest = new MapTest();
//        mapTest.testAdd().printKey();
      //  mapTest.printJsonString();

       // mapTest.printKey();
       // mapTest.printValue();

//        ListTest listTest = new ListTest();
 //       listTest.testAdd();
        //listTest.printJsonString();
//        ListPojoTest pojoTest = new ListPojoTest();
//       // pojoTest.addData();
//        pojoTest.addByForV2();
//        pojoTest.printJsonString();
        ListPojoTest pojoTest = new ListPojoTest();
        pojoTest.addByForV2();
        pojoTest.printJsonString();
    }
}
