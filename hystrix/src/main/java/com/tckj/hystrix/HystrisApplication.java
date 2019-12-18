package com.tckj.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author WCH
 * @date 2019/12/18 15:57
 */
@SpringBootApplication
@EnableHystrixDashboard //打开熔断监视器
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.tckj.feign")
@ComponentScan({"com.tckj.feign","com.tckj.hystrix"})
public class HystrisApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrisApplication.class,args);
    }
}
