package io.github.tplxmx96.bean;

/**
 * 加强版的字符串 - 带缓存的字符串
 */
public class StringBufferDemo {
    public static void main(String[] args){
        final int N = 100000;   //10万
        long starTime = System.currentTimeMillis();
        String str = "*";
        for (int i = 0; i < N; i++) { //10万次循环
            str += "*";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("+=用时：" + (endTime - starTime) + "毫秒");

        //使用StringBuffer进行字符串拼接
        starTime = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer("*");
        for (int i = 0; i < N; i++) { //10万次循环
            str1.append("*");
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的append用时：" + (endTime - starTime) + "毫秒");


        //StringBuffer
        starTime = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("*");
        for (int i = 0; i < N; i++) { //10万次循环
            str2.append("*");
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的append用时：" + (endTime - starTime) + "毫秒");



//        String str1 = "a";
//        String str2 = "b";
//        String str3 = str1 + str2;
//        str3 = str1.concat(str2);
//
//        //底层实现;
//        String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
    }
}
