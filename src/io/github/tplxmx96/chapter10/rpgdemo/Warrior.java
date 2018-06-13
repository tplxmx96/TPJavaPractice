package io.github.tplxmx96.chapter10.rpgdemo;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * 战士类 -   继承了Hero类
 */
public class Warrior extends Hero {
    /** 战士类的静态属性，每实例化一个新的展示对象,ID++ */
    public static int ID = 1;
    /** 战士的特有属性：物理攻击力 */
    private int pysicalAttch;


    public Warrior(){
        super();   //子类构造中，默认就会调用父类构造
//        System.out.println("子类默认构造");
        setNickName("默认战士" + ID);
        setLevel(1);
        setMaxLife(100);
        setCurrLife(100);
        setPysicalAttch(99);
        ID++;
    }

    public Warrior(String nickName, int pysicalAttch){
        this();
        setNickName(nickName);
        setPysicalAttch(pysicalAttch);
    }
        @Override   //注解：重写
    public void move() {
        System.out.println("战士的移动：交通基本靠腿！");
    }

    /**
     * 重写Object类的equsls方法，以便比较两个对象是否相等
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        //如果传入的obj对是Warrior类的实例
        if (!(obj instanceof Warrior)){
            return false;
        }
        Warrior newWarrior = (Warrior) obj;
        //比较两个属性
        if (getNickName().equals(newWarrior.getNickName()) && getPysicalAttch() == newWarrior.getPysicalAttch()){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(getLevel());
        str.append("\t");
        str.append(getNickName());
        str.append("\t");
        str.append(getMaxLife());
        str.append("\t\t");
        str.append(getCurrLife());
        str.append("\t");
        str.append(getPysicalAttch());
        return str.toString();
    }
    //    @Override   //注解：重写
//    public void move() {
//        System.out.println("战士的移动：交通基本靠腿！");
//    }

    /**
     * 重写父类的运动方法
     * 子类重写父类的move方法时，这里调用的就是子类实现的move
     */

//    public void move(){
//        System.out.println(getPysicalAttch() + "：移动基本靠腿！");
//    }


    public int getPysicalAttch() {
        return pysicalAttch;
    }

    public void setPysicalAttch(int pysicalAttch) {
        this.pysicalAttch = pysicalAttch;
    }
}
