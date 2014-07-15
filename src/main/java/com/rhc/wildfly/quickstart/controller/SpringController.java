package com.rhc.wildfly.quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rfagin-contractor on 7/14/14.
 */
@Controller
public class SpringController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){
        return "index";
    }
}
