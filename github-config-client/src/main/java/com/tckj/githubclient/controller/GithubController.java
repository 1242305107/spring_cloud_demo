package com.tckj.githubclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github")
public class GithubController {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping
    public String getName(){
        return "hello 我是："+name;
    }


}
