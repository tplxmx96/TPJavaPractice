package io.github.tplxmx96.chapter13.decorator;

/**
 * 装饰器父类，用来为基本的组件实现功能的扩展
 */
public class Decorator extends Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void read() {
        //注意：观察谁是真正实现了read功能
        //将请求转发给component对象，转发后，就可以执行一些扩展操作了
        component.read();
    }
}
