package com.tckj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author WCH
 * @date 2019/12/17 14:13
 */
@SpringBootApplication
@EnableEurekaServer //声明该类是Eureka server 服务，提供服务注册和服务发现
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
