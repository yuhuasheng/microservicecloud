package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 230257
 * @Date 2020/8/21 14:50
 */
@SpringBootApplication
@EnableEurekaServer //EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7001_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
