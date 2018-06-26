package io.github.tplxmx96.chapter13.decorator;

/**
 * 真正"干活的"组件类
 * 实现了基本的read方法
 */
public class TrueComponent extends Component {

    @Override
    public void read() {
        System.out.println("TrueComponent实现的read方法");
    }
}
