package io.github.tplxmx96.chapter11.pkgame;

/**
 * 城堡类 - 城堡不是英雄！
 */
public class Castle implements Assailable{
    private String name;
    private int x;
    private int y;
    private int maxHP;
    private int hp;
    private int attackRange;

    public Castle(String name,int x,int y,int attackRange){
        setName(name);
        setX(x);
        setY(y);
        setAttackRange(attackRange);
        setMaxHP(100);
        setHp(100);
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttackRange() {
        return attackRange;
    }
    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
    @Override
    public boolean canFightByDistance(Assailable assa) {
        //1、计算与另一个可攻击对象之间的距离
        //2、如果攻击距离合法就进行攻击
        return false;
    }

    @Override
    public void fight(Assailable assa) {
        //接受城堡的攻击力固定
        int attack = 15;
        assa.setHp(assa.getHp() - attack);

    }
}
