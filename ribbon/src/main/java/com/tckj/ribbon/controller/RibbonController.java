package com.tckj.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WCH
 * @date 2019/12/17 17:39
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getPort")
    public String getPort(){
        System.out.println("进入ribbon");
        //return restTemplate.getForObject("http://127.0.0.1:9002/student/getPort",String.class);
        return restTemplate.getForObject("http://server-provider/student/getPort",String.class);
    }


}
