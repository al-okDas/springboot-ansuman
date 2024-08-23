package com.example.demo.service;

import com.example.demo.repository.Courses;
import com.example.demo.repository.CoursesRepository;
import com.example.demo.repository.Student;
import com.example.demo.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService implements TestServiceInterface{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CoursesRepository coursesRepository;
    @Autowired
    public RestTemplate rest;
    @Override
    public void  doSomething() throws Exception {
        Student st1=new Student();
        st1.setName("Ansuman");
        List<Courses> c1=new ArrayList<>();
        c1.add(new Courses("Physics"));
        st1.setCourses(c1);
        studentRepository.saveAndFlush(st1);
    }

    @Override
    public  void createCourses(){
        coursesRepository.saveAndFlush(new Courses("Math"));
    }



    @Override
    @Transactional
    public void testTransaction(boolean someCondition) throws Exception {
        coursesRepository.save(new Courses("Chemistry"));
        if (someCondition) { // Replace with your desired condition
            throw new RuntimeException("Test Transaction");
        }
        coursesRepository.save(new Courses("CS"));
    }
}
