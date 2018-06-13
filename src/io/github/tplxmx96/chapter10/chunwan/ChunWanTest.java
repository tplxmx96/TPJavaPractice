package io.github.tplxmx96.chapter10.chunwan;

public class ChunWanTest {
    public static void main(String[] args){
        Director 张艺谋 = new Director();

        Singer 宋祖英 = new Singer("宋祖英");

        Dancer 杨丽萍 = new Dancer("杨丽萍");

//        Actor actor = new Actor("吴宗宪");

        张艺谋.action(宋祖英);

        张艺谋.action(杨丽萍);

//        张艺谋.action(actor);
    }
}
