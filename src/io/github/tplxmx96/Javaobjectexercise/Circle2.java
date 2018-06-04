package io.github.tplxmx96.Javaobjectexercise;

import java.util.Scanner;

public class Circle2 {
    /** 圆的半径 */
    public double radius;
    /** 圆的周长 */
    public double perimeter;
    /** 圆的面积 */
    public double area;

    public Circle2(){
        inputRadius();
    }
    public Circle2(double radius1){
        if (radius1 > 0){
            radius = radius1;
        }else{
            inputRadius();
        }
    }

    private void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径");
        radius = input.nextDouble();
        input.close();
    }
    public void showPreimeter(){
        if (radius <= 0){
            inputRadius();//如果用户没有输入半径，那么强制让用户输入半径
        }
        perimeter = 2 * Math.PI * radius;
        System.out.println("周长为：" + perimeter);
    }
    public void showArea(){
        if (radius <= 0){
            inputRadius();//如果用户没有输入半径，那么强制让用户输入半径
        }
        area = Math.PI * Math.pow(radius,2);
        System.out.println("面积为：" + area);
    }
}
