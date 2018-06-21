package io.github.tplxmx96.chapter12;

/**
 * 自定义异常 - 小于零时触发
 */

public class LessThanZeroException extends Exception {
    //重写父类的两个构造方法即可
    private int value;
    public LessThanZeroException(){
        super("数字不能小于零！");
    }
    public LessThanZeroException(int value){
        super("输入的数字为：" + value + "不能小于零！");

    }
}
