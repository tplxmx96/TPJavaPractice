package io.github.tplxmx96.Javaobjectexercise;

public class Circle3 {
    /** 圆的半径 */
    private double radius;
    /** 圆的周长 */
    private double perimeter;
    /** 圆的面积 */
    private double area;

    public double getRadius(){
        return radius;
    }
    public void show(){
        System.out.println("周长为：" + this.getPerimeter());
        System.out.println("面积为：" + this.getArea());
    }
    public Circle3(){}

    public Circle3(double radius) {
//        this.radius = radius;
        this.setRadius(radius);
    }
    public void setRadius(double radius){
        if (radius <= 0) {//封装的好处：可以对传入的属性进行简单的
            radius = 1;
        }else {
            //this -> 自指钟 朕/寡人
            this.radius = radius;
        }


    }


    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public double getArea() {
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
