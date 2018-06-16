package io.github.tplxmx96.chapter11;

/**
 * 吃接口
 */
public interface Eat {
    String name = "接口中定义的数据域";


   default public void eating(){
       System.out.printf("Eat接口的默认实现");
   }
}
interface Eat1 {
    default public void eating() {
        System.out.printf("Eat1接口的默认实现");
    }

}