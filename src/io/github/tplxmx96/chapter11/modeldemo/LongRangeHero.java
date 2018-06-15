package io.github.tplxmx96.chapter11.modeldemo;

/**
 * 远程攻击英雄
 */

public abstract class LongRangeHero extends Hero{
    private int attackRange;  //攻击距离

    public LongRangeHero(){
        super();
    }
    public LongRangeHero(long id,String name,int attackRange,int x,int y){
        super(id,name);
        setAttackRange(attackRange);
        setX(x);
        setY(y);
    }


    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}
