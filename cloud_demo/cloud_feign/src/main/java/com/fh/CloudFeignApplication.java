package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients//1.支持Hystrix和他的fallback
                   //2.支持ribbon 的负载均衡
                   //3.启动时会进行包扫描，扫描所有带@FeignClient的类并进行处理
@EnableCircuitBreaker
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }

}
