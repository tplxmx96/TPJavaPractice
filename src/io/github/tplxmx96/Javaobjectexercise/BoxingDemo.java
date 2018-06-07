package io.github.tplxmx96.Javaobjectexercise;

public class BoxingDemo {
    public static void main(String[] args){
        double num1 = 3.14;
        Double dNum1 = new Double("3.14");
        Double dNum1_1 = Double.valueOf(num1); //两种装箱的方法
        Double dNum2_2 = 3.14;      //自动装箱

        num1 = dNum1;       //自动拆箱
        num1 = dNum1_1.doubleValue();


        System.out.println(num1 + "\t" + dNum1);
    }
}
