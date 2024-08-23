package com.example.demo.repository;

import jakarta.persistence.*;
import org.apache.tomcat.jni.Library;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String Name;

    @Column
    @OneToMany(targetEntity= Courses.class,cascade = CascadeType.PERSIST)
    private List<Courses> courses;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }


}
