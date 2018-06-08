package io.github.tplxmx96.datatype;

/**
 * 字符串示例
 */

public class StringDemo {
    public static void main(String[] args){
        String value = "中国人民解放军";
//        value += "老牛鼻子了！";
        value = value.concat("老牛鼻子了");
        System.out.println(value);
    }
}
