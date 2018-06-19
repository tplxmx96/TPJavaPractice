package io.github.tplxmx96.chapter12;

import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄(必须是整型数字):");
        int age = -1;
        try{
            age = input.nextInt();
        }catch(Exception e){
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        System.out.println("输入的年龄是：" + age);
    }
}
