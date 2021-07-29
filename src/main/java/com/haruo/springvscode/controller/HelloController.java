package com.haruo.springvscode.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * HelloController
 */

 @RestController
public class HelloController {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World";
    }
    

}