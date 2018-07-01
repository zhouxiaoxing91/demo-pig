package com.nancy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @Value("${test.demo}")
    private String str ;

    @RequestMapping(value = "/pig", method = {RequestMethod.GET, RequestMethod.POST})
    public String testHelloWorld(){
        System.out.println("hello pig" + " str :" + str);
        return "hello pig" ;
    }
}
