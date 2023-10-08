package com.example.springbootdemo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHER XXY
 * @DATE 2023/10/8
 **/
@RestController
public class testController {

    @RequestMapping("/testController")
    public String test(){
        return "Hello Word testController";
    }
}
