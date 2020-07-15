package json_response;

import java.io.Serializable;

public class Student implements Serializable {

    private Long id;
    private String name;
    private String sureName;

    public Student() {}

    public Student(Long id, String name, String sureName) {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
