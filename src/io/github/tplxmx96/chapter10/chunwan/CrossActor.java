package io.github.tplxmx96.chapter10.chunwan;

public class CrossActor extends Actor {
    public CrossActor() {
        super();
    }


    public CrossActor(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "现在的相声不景气啦，我只能说：想死你们了！");
    }
}
