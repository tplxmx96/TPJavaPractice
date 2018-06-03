package io.github.tplxmx96.collection;

import com.alibaba.fastjson.JSON;
import io.github.tplxmx96.bean.Health;
import io.github.tplxmx96.bean.Person;
import io.github.tplxmx96.bean.Result;

import java.util.ArrayList;
import java.util.List;

public class ListPojoTest {

    private List<Person> personList = new ArrayList<>();

    public void addData(Health health) {

        Person p1 = new Person();
        p1.setFirstName("tan");
        p1.setFirstName("pan");
        p1.setEmail("tplxmx96@gmail.com");
        p1.setAddress("上海");

        Person p2 = new Person();
        p2.setFirstName("tan2");
        p2.setFirstName("pan2");
        p2.setEmail("tplxmx96@gmail.com");
        p2.setAddress("上海");

        Person p3 = new Person();
        p3.setFirstName("tan3");
        p3.setFirstName("pan3");
        p3.setEmail("tplxmx96@gmail.com");
        p3.setAddress("上海");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
    }

    public void addByFor() {
        for (int i = 0; i < 3; i++) {
            Person person = new Person();
            person.setFirstName("tan" + i);
            person.setLastName("pan" + i);
            person.setEmail("tplxmx96@gmail.com");
            person.setAddress("上海");

            Health health =  new Health();
            health.setHeight(177 + i);
            health.setWeight(160 + i);
            health.setEyesight(0.7f);
            person.setHealth(health);

            personList.add(person);
        }

    }


    /**
     * [{
     * "address": "上海",
     * "email": "tplxmx96@gmail.com",
     * "firstName": "pan0"
     * }, {
     * "address": "上海",
     * "email": "tplxmx96@gmail.com",
     * "firstName": "pan1"
     * }, {
     * "address": "上海",
     * "email": "tplxmx96@gmail.com",
     * "firstName": "pan2"
     * }]
     */
    public void printJsonString() {
        System.out.println(JSON.toJSONString(personList));
    }

    public void printJsonString2() {
        Result result = new Result();
        result.setPersons(personList);
        System.out.println(JSON.toJSONString(result));
    }
}
