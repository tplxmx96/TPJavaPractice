package io.github.tplxmx96.collection;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    private List<String> list = new ArrayList<>();

    public void testAdd(){
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
    }
    public void printJsonString(){
        System.out.println(JSON.toJSONString(list));
    }
}
