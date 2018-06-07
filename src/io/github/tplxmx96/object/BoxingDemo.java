package io.github.tplxmx96.object;

import io.github.tplxmx96.bean.Book;

public class BoxingDemo {
    public static void main(String[] args){



        Integer num1 = new Integer(200);
        Integer num2 = new Integer(200);
        //两个对象之间的比较方法
        System.out.println(num1.compareTo(num2));

//        Integer num1 = Integer.valueOf(200);
//        Integer num2 = 200;
//        System.out.println(num1 == num2);


//        double num1 = 3.14;
//        Double dNum1 = new Double("3.14");
//        Double dNum1_1 = Double.valueOf(num1); //两种装箱的方法
//        Double dNum2_2 = 3.14;      //自动装箱
//
//        num1 = dNum1;       //自动拆箱
//        num1 = dNum1_1.doubleValue();
//
//
//        System.out.println(num1 + "\t" + dNum1);
    }
}
