package io.github.tplxmx96.bean;

import java.util.List;

public class Result {
    private List<Person> persons;
    private int code;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
