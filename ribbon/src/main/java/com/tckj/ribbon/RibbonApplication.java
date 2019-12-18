package com.tckj.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WCH
 * @date 2019/12/17 17:35
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getReatTemplate(){
        return new RestTemplate();
    }


}
