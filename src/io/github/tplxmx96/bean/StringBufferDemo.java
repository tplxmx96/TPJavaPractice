package io.github.tplxmx96.bean;

/**
 * 加强版的字符串 - 带缓存的字符串
 */
public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer strBuffer = new StringBuffer("你好,世界！");
        StringBuffer strBuffer1 = new StringBuffer("你好,世界！");
        StringBuffer strBuffer2 = new StringBuffer("你好,世界！");

//        System.out.println(strBuffer.toString().equals(strBuffer1.toString()));
        System.out.println(strBuffer.reverse());   //反转字符串

//        strBuffer1.insert(3,"abc");    //在规定的下标处插入元素
//        System.out.println(strBuffer1);

//        strBuffer2.deleteCharAt(3);
//        System.out.println(strBuffer2);
        strBuffer2.delete(2,4);         //删除[2,4]下标之间的元素
        System.out.println(strBuffer2);

        strBuffer1.replace(2,4,"北京");
        System.out.println(strBuffer1);

        strBuffer.setCharAt(3,'神');
        System.out.println(strBuffer);

        System.out.println("缓存大小：" + strBuffer.capacity());

        strBuffer.setLength(0);  //相当于清空了字符串对象

        strBuffer.trimToSize();


//        final int N = 100000;   //10万
//        long starTime = System.currentTimeMillis();
//        String str = "*";
//        for (int i = 0; i < N; i++) { //10万次循环
//            str += "*";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("+=用时：" + (endTime - starTime) + "毫秒");
//
//        //使用StringBuffer进行字符串拼接
//        starTime = System.currentTimeMillis();
//        StringBuffer str1 = new StringBuffer("*");
//        for (int i = 0; i < N; i++) { //10万次循环
//            str1.append("*");
//        }
//
//        endTime = System.currentTimeMillis();
//        System.out.println("StringBuffer的append用时：" + (endTime - starTime) + "毫秒");
//
//
//        //StringBuffer
//        starTime = System.currentTimeMillis();
//        StringBuilder str2 = new StringBuilder("*");
//        for (int i = 0; i < N; i++) { //10万次循环
//            str2.append("*");
//        }
//
//        endTime = System.currentTimeMillis();
//        System.out.println("StringBuilder的append用时：" + (endTime - starTime) + "毫秒");
//


//        String str1 = "a";
//        String str2 = "b";
//        String str3 = str1 + str2;
//        str3 = str1.concat(str2);
//
//        //底层实现;
//        String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();
    }
}
