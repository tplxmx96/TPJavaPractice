package io.github.tplxmx96.chapter10.chunwan;

/**
 * 导演类 -- 相当于我们项目中的核心业务类
 * 主要功能：让演员就位，开始表演
 */
public class Director {
    /**
     * 导演的"Action"方法，让演员就位开始表演节目
     * @param actor
     */
    public void action(Actor actor){
        actor.performs();

    }
}
