package io.github.tplxmx96.chapter12;


public class DivisionDemo {
    /**
     * 计算两个字符串数字的除法(需要类型转换)
     * @param strName1
     * @param strName2
     */
    public static void division(String strName1, String strName2) throws ArithmeticException,NumberFormatException {
        int num1 = Integer.parseInt(strName1);
        int num2 = Integer.parseInt(strName2);
        int result = num1 / num2;
        System.out.println("result = " + result);

    }
    public static void main(String[] args){
        try {
            //谁调用，谁处理
            division("123","0");
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("程序正常结束！");
    }
}
