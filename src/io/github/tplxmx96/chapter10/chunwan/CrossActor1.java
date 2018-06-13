package io.github.tplxmx96.chapter10.chunwan;

public class CrossActor1 extends Actor {
    public CrossActor1() {
        super();
    }


    public CrossActor1(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "：相声讲究脱鞋就唱。。。。。");
    }
}
