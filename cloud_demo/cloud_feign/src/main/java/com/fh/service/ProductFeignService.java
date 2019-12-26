package com.fh.service;

import org.springframework.cloud.openfeign.FeignClient;

// name: 服务者application.yml中的spring.application.name
// fallback: 断路器执行方法，即方法执行失败调用
@FeignClient(name="cloud-service", fallback = ProductServiceFallback.class)
public interface ProductFeignService extends IProductController {
}