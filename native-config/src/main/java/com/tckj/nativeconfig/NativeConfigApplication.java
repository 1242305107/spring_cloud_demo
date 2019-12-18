package com.tckj.nativeconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author WCH
 * @date 2019/12/18 17:40
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class NativeConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigApplication.class,args);
    }
}
