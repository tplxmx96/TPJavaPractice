package io.github.tplxmx96.abstest;


public class SubA extends ParentA{



    public static void main(String[] args){
//      //  ParentA a = new SubA();
//      //  a.testParentMethod();
//        SubA subA = new SubA();
//        subA.testParentMethod();
        ParentA a = new SubA();
        a.testParentMethod();
        a.testParentMethod1();

        SubA subA = new SubA();
        subA.testParentMethod1();
    }
}
