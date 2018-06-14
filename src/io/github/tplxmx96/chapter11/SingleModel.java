package io.github.tplxmx96.chapter11;

import com.sun.org.apache.regexp.internal.RE;

/**
 * 单例模式示例 - 套路
 */
public class SingleModel {
    /** 用来保存唯一的本类的实例 */
    private static SingleModel me = null;
    public int count = 0;
    private SingleModel(){
        count++;
    }

    /**
     * 获得本类唯一的一个实例 -- 单例模式的核心方法
     * @return
     */
    public static SingleModel getInstance(){
        if (null == me)
            me = new SingleModel();
        return me;

    }

}
