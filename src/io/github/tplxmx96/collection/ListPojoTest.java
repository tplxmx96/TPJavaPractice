package io.github.tplxmx96.collection;

import com.alibaba.fastjson.JSON;
import io.github.tplxmx96.bean.Health;
import io.github.tplxmx96.bean.Student;
import io.github.tplxmx96.bean.Result;
import io.github.tplxmx96.bean.School;

import java.util.ArrayList;
import java.util.List;

public class ListPojoTest {

    private List<Student> studentList = new ArrayList<>();

    public void addByForV1() { //V ---> Version --->版本
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setFirstName("tan");
            student.setLastName("pan");
            student.setEmail("tplxmx96@mail.com");
            student.setAddress("上海");

            Health health = new Health();
            health.setHeight(185 + i);
            health.setWeight(160 + i);
            health.setEyesight(0.6f);
            student.setHealth(health);

            studentList.add(student);
        }
    }

    public void addByForV2() {
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.setFirstName("tan" + i);
            student.setLastName("pan" + i);
            student.setEmail("tplxmx96@gmail.com");
            student.setAddress("上海");

            Health health = new Health();
            health.setHeight(177 + i);
            health.setWeight(160 + i);
            health.setEyesight(0.7f);
            student.setHealth(health);

            School school = new School();
            school.setNursery("幼儿园");
            school.setPrimary("小学");
            school.setMiddle("中学");
            school.setSenior("高中");
            school.setCollege("大学");

            student.setSchool(school);
            studentList.add(student);
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
        System.out.println(JSON.toJSONString(studentList));
    }

    public void printJsonString2() {
        Result result = new Result();
        result.setStudents(studentList);
        System.out.println(JSON.toJSONString(result));
    }

}