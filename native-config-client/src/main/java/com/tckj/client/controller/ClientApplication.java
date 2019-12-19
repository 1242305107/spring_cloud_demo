package com.tckj.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WCH
 * @date 2019/12/19 16:55
 */
@RestController
@RequestMapping("/client")
public class ClientApplication {

    @Value("${abc}")
    private String name;

    @GetMapping("/getName")
    public String getName(){
        return name;
    }


    @GetMapping("/getName1")
    public String getName1(){
        return "hello";
    }

}
