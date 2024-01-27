package com.odogwu_d.javacrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/")
    public String helloWorld(){
        return "Welcome to Odogwu_D techs!!";
    }


}
