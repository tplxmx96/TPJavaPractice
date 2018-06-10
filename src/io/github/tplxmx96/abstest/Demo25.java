package io.github.tplxmx96.abstest;

public class Demo25 {
    public static void main(String[] args) {

        Car car = new PoliceCar();

        car.cautionSound();

        car = new FireCar();

        car.cautionSound();

    }
}
