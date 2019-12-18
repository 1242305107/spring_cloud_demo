package com.tckj.consumers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WCH
 * @date 2019/12/18 8:59
 */
@RestController
@RequestMapping("/consumers")
public class ConsumersController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getPort")
    public String getPort(){
        System.out.println("进入client");
       return restTemplate.getForObject("http://localhost:9002/student/getPort",String.class);
        //return restTemplate.getForObject("http://server-provider/student/getPort",String.class);
    }



}
