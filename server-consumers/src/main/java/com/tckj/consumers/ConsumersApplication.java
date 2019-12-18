package com.tckj.consumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WCH
 * @date 2019/12/17 14:13
 */
@SpringBootApplication
//@EnableEurekaClient
public class ConsumersApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumersApplication.class,args);
    }


    @Bean
    //@LoadBalanced
    public RestTemplate getReatTemplate(){
        return new RestTemplate();
    }

}
