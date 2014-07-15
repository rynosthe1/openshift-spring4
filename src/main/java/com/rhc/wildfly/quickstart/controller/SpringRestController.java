package com.rhc.wildfly.quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rfagin-contractor on 7/14/14.
 */
@RestController
public class SpringRestController {

    @RequestMapping("/spring")
    public String someString(){
        return "HELLO WORLD";
    }

}
