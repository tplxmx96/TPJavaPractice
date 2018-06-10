package io.github.tplxmx96.bean;

/**
 * 加强版的字符串 - 带缓存的字符串
 */
public class StringBufferDemo {
    public static void main(String[] args){
        String str1 = "a";
        String str2 = "b";
        String str3 = str1 + str2;
        str3 = str1.concat(str2);

        //底层实现;
        String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
    }
}
