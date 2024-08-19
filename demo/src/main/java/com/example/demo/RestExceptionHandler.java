package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {


    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex){
        return "error happended here "+ex.getMessage()+" from advice";
    }
}
