package com.example.demo.service;

import com.example.demo.model.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService implements TestServiceInterface{

    @Autowired
    public RestTemplate rest;
    @Override
    public void  doSomething() throws Exception {
        TestPojo obj=new TestPojo();
        obj.setName("Alok");
        obj.setValue("something");
        System.out.println("Successfully called TestService");

    }
}
