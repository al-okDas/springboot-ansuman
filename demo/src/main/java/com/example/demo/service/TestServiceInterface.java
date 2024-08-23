package com.example.demo.service;


import jakarta.transaction.Transactional;

public interface TestServiceInterface {
    public void doSomething() throws Exception;

    void createCourses();


    @Transactional
    void testTransaction(boolean someCondition) throws Exception;
}
