package com.tckj.githubconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author WCH
 * @date 2019/12/18 17:43
 */
@SpringBootApplication
@EnableConfigServer //声明配置中心
public class GithubConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(GithubConfigApplication.class,args);
    }
}
