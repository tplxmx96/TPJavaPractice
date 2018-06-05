package io.github.tplxmx96.Javaobjectexercise;

import io.github.tplxmx96.bean.Health;

/**
 * 游戏中的英雄类
 */

public class Hero {
    /**
     * 玩家的名称创建后不能更改
     * 级别在1-999之间
     * 玩家每级所需经验公式:
     * ((等级-1)^3 + 60）/ 5 * ((等级-1) * 2 + 60)
     * */
    private long id;
    private String nickName;
    private int level;
    private long currExp;//当前的经验值
    private long exp;    //当前级别升级所需的经验值 - 固定值((等级-1)^3 + 60）/ 5 * ((等级-1) * 2 + 60)

    public Hero(){
        super();
    }
    public Hero(String nickName){
        this.nickName = nickName;
    }
    public Hero(long id,String nickName,int level,long exp){
        super();
        this.id = id;
        this.nickName = nickName;
        this.level = level;
        this.exp = exp;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0)id = 1;
        else
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

//    private void setNickName(String nickName) {
//        if (null == nickName){
//            nickName = "未知英雄";
//        }else{
//            this.nickName = nickName;
//        }
//    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1 || level > 999){
            this.level = 1;//如果级别超限，就重新从1级开始
            //如果大于999，可以设置英雄角色转生轮数+1 -- 中国特色
        }else{
            this.level = level;
        }
    }

    public long getCurrExp() {
        return currExp;
    }

    public void setCurrExp(long currExp) {
        this.currExp = currExp;
    }

    public long getExp() {
//        玩家每级升级所需经验公式
//        ((等级-1)^3 + 60）/ 5 * ((等级-1) * 2 + 60)
        exp = ((long)Math.pow(level = 1,3) + 60) /5 * ((level - 1) * 2 + 60);
        return exp;
    }
    //因为玩家每个级别升级所需的经验值是固定公式计算的，所以不需要用户手动调用
//    public void setExp(long exp) {
//        this.exp = exp;
//    }
}
