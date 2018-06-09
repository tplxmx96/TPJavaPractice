package io.github.tplxmx96.abstest;

public class SubA1 extends ParenA1{
    public static void main(String[] args){
        ParenA1 parenA1 = new ParenA1();
        parenA1.tsetParentMethod1();

        SubA1 subA1 = new SubA1();
        subA1.tsetParentMethod1();
    }
}
