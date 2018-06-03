package io.github.tplxmx96.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    private Map<String,Object> data = new HashMap<>();

    public MapTest testAdd(){
        data.put("first_name","tan");
        data.put("last_name","pan");
        data.put("address","hunan");
        data.put("email","tplxmx96@gmail.com");
        return this;
    }

    /**
     * 使用迭代器的方式遍历循环输出key-value
     */
    public void iteratorPrint(){
        Iterator<Map.Entry<String,Object>> it = data.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Object> entry = it.next();
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }

    }
    public void printKey(){
       for (String key : data.keySet()){
           System.out.println("key=" + key + " and velue" + data.get(key));
       }
    }
    public void printValue(){
        for (Object value : data.values()){
            System.out.println("value=" + value);
        }
    }

}
