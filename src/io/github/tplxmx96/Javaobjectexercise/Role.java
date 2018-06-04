package io.github.tplxmx96.Javaobjectexercise;
/**
 * 游戏的角色类
 */

public class Role {
    //    名称：劳拉
    //    等级：25
    //    职业：考古学家
    //    技能：双枪
    /** 游戏角色的名称属性 */
    public String name;
    /** 等级 */
    public int level;
    /** 职业 */
    public String job;

    public Role(){
    }
    /**
     * 构造方法/构造器
     * 1、没有返回类型
     * 2、方法名和类名一致
     */
    public Role(String name1,int level1,String job1){
        name = name1;
        level = level1;
        job1 = job1;

    }

    public void show(){
        System.out.println(name + "\t" + level + "\t" + job);
    }

    /**
     * 释放技能
     */
    public void doSkill(){
        if (name.equals("劳拉")){
            System.out.println("劳拉的经典技能：双枪老太婆");
        }else if (name.equals("孙悟空")){
            System.out.println("吃俺老孙一棒：");
        }else{
            System.out.println(name + ":发出了一记必杀！");
        }
    }




}
