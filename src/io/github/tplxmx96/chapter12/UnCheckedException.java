package io.github.tplxmx96.chapter12;

/**
 * 免检异常 - RunTimeException
 */
public class UnCheckedException {


    public static void main(String[] args){
//        String value = null;
//        System.err.println(value.toString());
//
//        String strValue = "123a";
//        //字符串转换为数字
//        int value1 = Integer.parseInt(strValue);
//        System.out.println(value1);

        Person p = new Person();
        Student stu = (Student) p;
    }
}
class Person{

}
class Student extends Person{

}