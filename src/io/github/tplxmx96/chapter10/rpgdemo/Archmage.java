package io.github.tplxmx96.chapter10.rpgdemo;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

/**
 * 法师类
 */
public class Archmage extends Hero {
    /** 战士类的静态属性，每实例化一个新的展示对象,ID++ */
    public static int ID = 1;
    private int magicAttack;


    public Archmage(){
        setNickName("默认法师" + ID);
        setLevel(1);
        setMaxLife(100);
        setCurrLife(100);
        setMagicAttack(99);
        ID++;
    }
    public Archmage(String nickName){
        this();  //调用本类的默认构造
        setNickName(nickName);
    }

    /**
     * 重写toString方法 封装打印角色信息的逻辑
     * @return
     */
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
        str.append(getMagicAttack());
        return str.toString();
    }

    public void biubiubiu(){
        System.out.println("大法师" + getNickName() + "正在搓火球");
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }
}
