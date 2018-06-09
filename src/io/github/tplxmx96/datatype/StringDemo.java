package io.github.tplxmx96.datatype;

/**
 * 字符串示例
 */

public class StringDemo {
    public static void main(String[] args){
        //演示常用的几种String对象的构造方法
        String str1 = "你好，世界！";
        String str2 = new String();   //使用默认构造 String str2 = "";
        String str3 = new String(str1);

        char[] chArray = {'a','b','c'};  //C中：字符数组和字符串的区别就在于最后一个元素是否是\0
        //将字符数组转换成String对象
        String str4 = new String(chArray);
        chArray = str4.toCharArray();

        //字节数组与字符串的转换  byte数据类型：-128到127之间
        byte[] byteArray = {104,101,108,108,111};
        String str5 = new String(byteArray);
        System.out.println(str5);











//        String value = "中国人民解放军";
////        value += "老牛鼻子了！";
//        value = value.concat("老牛鼻子了");
//        System.out.println(value);
    }
}
