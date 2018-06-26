package io.github.tplxmx96.chapter13.decorator;

/**
 * 装饰器的实现类B
 */
public class ComponentImpIB extends Decorator{


    public ComponentImpIB(Component component){
        super(component);
    }

    @Override
    public void read() {
        //注意：在原始的read方法前后，分别调用了自定义的方法
        //即实现了对原read方法的功能扩展
        this.extndsRradA();
        super.read();  //原始的read方法
        this.extndsRradB();
    }

    private void extndsRradA(){
        System.out.println("ComponentImpIA实现的扩展方法:extndsRradA");
    }

    private void extndsRradB(){
        System.out.println("ComponentImpIB实现的扩展方法:extndsRradB");
    }
}
