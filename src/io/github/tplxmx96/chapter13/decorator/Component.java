package io.github.tplxmx96.chapter13.decorator;

/**
 * 抽象的组件类，用来定义组件做具有的基本方法
 * InputStream/OutputSream/Reader/Writer
 */
public abstract class Component {
    /**
     * 假设组件中定义了一个通用的read读取方法，要求子类进行实现
     */
    public abstract void read();


}
