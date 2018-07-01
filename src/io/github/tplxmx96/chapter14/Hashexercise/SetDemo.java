package io.github.tplxmx96.chapter14.Hashexercise;

import java.util.*;

public class SetDemo {
    public static void main(String[] args){
//        HashSetDemo();
//        LinkedHashSetDemo();
        TreeSet();
    }
    public static void TreeSet(){
        TreeSet<String> citySet = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) > 0)return -1;
                if (o1.compareTo(o2) < 0)return 1;
                return 0;
            }
        });
        citySet.add("London");
        citySet.add("Paris");
        citySet.add("New York");
        citySet.add("Bei Jing");
        citySet.add("Shang Hai");
        citySet.forEach(str -> System.out.print(str + ","));
        System.out.println();
        System.out.println(citySet.higher("N"));
        System.out.println("New York之前的元素集合:" + citySet.headSet("New York"));
        System.out.println("New York之后的元素集合:" + citySet.tailSet("New York"));
        System.out.println("首元素:" + citySet.first());

//        citySet.pollFirst()   //返回第一个元素，并删除第一个元素
        System.out.println("删除第一个元素:" + citySet.pollFirst());
        citySet.forEach(str -> System.out.print(str + ","));


    }
    public static void HashSetDemo(){
        //Set:规则集两个特点1、不允许有重复的元素 2、无序
        Set<String> citySet = new HashSet<>();
        citySet.add("London");
        citySet.add("Paris");
        citySet.add("New York");
        citySet.add("Bei Jing");
        citySet.add("Shang Hai");
        citySet.forEach(str -> System.out.print(str + ","));

    }
    public static void LinkedHashSetDemo(){
        //LinkedHashSet:插入顺序与实际的顺序一致
        Set<String> citySet = new LinkedHashSet<>();
        citySet.add("London");
        citySet.add("Paris");
        citySet.add("New York");
        citySet.add("Bei Jing");
        citySet.add("Shang Hai");
//        citySet.remove("Paris");
        citySet.forEach(str -> System.out.print(str + ","));

    }
}
