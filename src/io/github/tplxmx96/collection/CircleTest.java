package io.github.tplxmx96.collection;

import io.github.tplxmx96.Javaobjectexercise.Circle;
import io.github.tplxmx96.Javaobjectexercise.Circle2;
import io.github.tplxmx96.Javaobjectexercise.Circle3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
//        Circle circle = new Circle();
//        circle.inputRadius();
//        circle.showPreimeter();
//        circle.showArea();
//        Circle2 circle2 = new Circle2();
//        circle2.showArea();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        double radius = input.nextDouble();
        Circle3 circle = new Circle3(radius);
        circle.show();








    }

}
