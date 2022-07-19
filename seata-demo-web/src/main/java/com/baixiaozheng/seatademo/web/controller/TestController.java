package com.baixiaozheng.seatademo.web.controller;

import com.baixiaozheng.seatademo.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    private TestService testService;



    @RequestMapping(value = "/noSeata", method = RequestMethod.POST)
    public String noSeata(){
        testService.noSeata();
        return "ok";
    }
    @RequestMapping(value = "/hasSeata", method = RequestMethod.POST)
    public String hasSeata(){
        testService.hasSeata();
        return "ok";
    }
}
