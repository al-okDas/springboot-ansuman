package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class TestService2 implements TestServiceInterface{
    @Override
    public void doSomething() {
        System.out.println("Successfully called TestService2");
    }
}
