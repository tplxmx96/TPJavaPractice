package io.github.tplxmx96.chapter10.rpgdemo;


/**
 * 战士类 -   继承了Hero类
 */
public class Warrior extends Hero {
    /** 战士的特有属性：物理攻击力 */
    private int pysicalAttch;

    public Warrior(){
        super();   //子类构造中，默认就会调用父类构造
        System.out.println("子类默认构造");
    }

    public Warrior(String nickName, int pysicalAttch){
        setNickName(nickName);
        setPysicalAttch(pysicalAttch);
    }

    @Override   //注解：重写
    public void move() {
        System.out.println("战士的移动：交通基本靠腿！");
    }

    /**
     * 重写父类的运动方法
     */

//    public void move(){
//        System.out.println(getPysicalAttch() + "：移动基本靠腿！");
//    }

    public int getPysicalAttch() {
        return pysicalAttch;
    }

    public void setPysicalAttch(int pysicalAttak) {
        this.pysicalAttch = pysicalAttch;
    }
}
