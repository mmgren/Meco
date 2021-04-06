package com.meco.spinrgdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Demo {

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String getUser() {
        return  "index";
    }
}
