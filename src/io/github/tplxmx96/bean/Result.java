package io.github.tplxmx96.bean;

import java.util.List;

public class Result {
    private List<Student> students;
    private int code;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
