package io.github.tplxmx96.chapter11;

public class Mouth implements Eat ,Eat1{

    @Override
    public void eating() {
        Eat1.super.eating();
    }
}
