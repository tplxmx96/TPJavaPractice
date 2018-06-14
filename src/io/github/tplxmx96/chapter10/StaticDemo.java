package io.github.tplxmx96.chapter10;

/**
 * 使用静态关键字实现了单例模式：只能获得某个类的唯一一个实例
 */

public class StaticDemo {
    private static StaticDemo me = null;

    /**
     * 将构造方法私有，以便实现外部无法使用new进行实例化的效果
     */
    private StaticDemo(){
        //将构造方法定义为私有的
        me = this;
    }

    /**
     * 得到当前类对象的实例,只能调用本方法
     * @return
     */
    public static StaticDemo getInstance(){
        if (me == null){
              me = new StaticDemo();//唯一的一次实例化
        }
        return me;
    }
    //静态属性/方式是先于类的实例存在的
    public static  int static_number = 1;

    public int normal_number = 1;

    /**
     * 静态方法中只能调用静态属性和静态方法
     */
    public void test(){
        static_number++;
        normal_number++;
    }

//    public static void main(String[] args){
//        StaticDemo staticDemo1 = new StaticDemo();
//        staticDemo1.test();
//
//        System.out.println(staticDemo1.static_number);
//        System.out.println(staticDemo1.normal_number);
//
//        StaticDemo staticDemo2 = new StaticDemo();
//        staticDemo2.test();
//
//        System.out.println(staticDemo1.static_number);
//        System.out.println(staticDemo1.normal_number);
//
//        staticDemo2.test();
//
//        System.out.println(staticDemo1.static_number);
//
//    }
}
