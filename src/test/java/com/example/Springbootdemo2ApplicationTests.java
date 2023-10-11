package com.example;

import com.example.polo.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootdemo2ApplicationTests {
    @Autowired
    private person p;

    @Test
    void contextLoads() {
        System.out.println(p);
    }

}
