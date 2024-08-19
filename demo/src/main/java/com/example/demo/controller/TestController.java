package com.example.demo.controller;

import com.example.demo.model.TestPojo;
import com.example.demo.service.TestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/root")
public class TestController {


    @Autowired
    public TestServiceInterface testService;

    @GetMapping("/test")
    public ResponseEntity<TestPojo> getDisplay() throws Exception {
        testService.doSomething();
        return ResponseEntity.status(HttpStatusCode.valueOf(500)).build();
    }



}
