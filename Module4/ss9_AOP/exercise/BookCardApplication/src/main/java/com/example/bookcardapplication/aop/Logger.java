package com.example.bookcardapplication.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
private static int count = 0;
private static int count1 = 0;
//    @Pointcut("execution (* com.example.bookcardapplication.controller.BookController.returnBook(..))||" +
//            "execution(* com.example.bookcardapplication.controller.BookController.rent())")
    @Pointcut("execution(* com.example.bookcardapplication.controller.BookController.rent(..))||execution(* com.example.bookcardapplication.controller.BookController.returnBook(..))")
    public void getAll(){
    }
    @AfterReturning(value = "getAll()")
    public void print(){
        count++;
        System.out.println("Library changed: " + count + " times");
    }


    @Pointcut("execution(* com.example.bookcardapplication.controller.BookController.*(..))")
    public void getAllManipulating(){

    }

    @After(value = "getAllManipulating()")
    public void show(){
        count1++;
        System.out.println("People get access to the site: " + count1 + " times");
    }

}
