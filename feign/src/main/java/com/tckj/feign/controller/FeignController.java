package com.tckj.feign.controller;

import com.tckj.entity.Student;
import com.tckj.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author WCH
 * @date 2019/12/18 11:11
 */
@RestController
@RequestMapping("/feign")

public class FeignController {


    @Autowired
    ProviderClient providerClient;


    @GetMapping("/getPort")
    public String getPort() {
        return providerClient.getPort();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return providerClient.findAll();
    }



}
