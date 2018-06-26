package io.github.tplxmx96.chapter13.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 使用装饰器模式的场合
 * 1、当我们需要在不影响其他对象的情况下，以动态、透明的方式为对象添加功能(扩展方法的实现)
 * 2、当不合适是使用继承，但是又想继续方法的扩展时
 */

public class DecoratorTest {
    public static void main(String[] args) throws FileNotFoundException {
        //创建要被装饰的原始对象
        Component component = new TrueComponent();
        //为原始对象透明的增加功能
        ComponentImpIA componentA = new ComponentImpIA(component);
//        componentA.read();

        ComponentImpIB componentB = new ComponentImpIB(componentA);
        componentB.read();


//        InputStream inputStream = new FileInputStream("co");
//        //使用带缓存的流对象装饰输入流对象
//        BufferedInputStream bInStream = new BufferedInputStream(inputStream);


    }
}
