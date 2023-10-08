package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @AUTHER XXY
 * @DATE 2023/10/8
 **/
@Controller
@RequestMapping("/hello")
public class testController {

    @GetMapping("/hello")
    @ResponseBody
    public String test(){
        return "Hello Word testController";
    }
}
