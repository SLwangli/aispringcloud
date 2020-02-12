package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author WangLi
 * @version 1.0.0
 * @creaTtime 2020-02-11 19:42
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard//声明启用可视化数据监控
@EnableCircuitBreaker//声明启用数据监控
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
