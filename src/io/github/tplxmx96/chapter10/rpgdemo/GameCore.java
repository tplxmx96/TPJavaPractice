package io.github.tplxmx96.chapter10.rpgdemo;

/**
 * 多态
 */

public class GameCore {

    public void moveRole(Warrior warrior){
        warrior.move();  //调用战士的移动方法
    }

    public void moveRole(Archmage archmage){
        archmage.move();  //调用法师的移动方法
    }

    public void moveRole(Assassin assassin){
        assassin.move();  //调用刺客的移动方法
    }



    /**
     * 使用多态
     * 多态：同一个实体，同时具有多种形式
     */
    public void moveRole(Hero hero){
        hero.move();     //调用父类对象的移动方法
    }
    public static void main(String[] aargs){
        Hero hero1 = new Warrior();  //战士是一种英雄
        gamecore.moveRole(hero1);    //移动1号英雄

        //动态绑定
        gamecore.moveRole(new Archmage());
    }
}

