package com.fh.service.impl;

import com.fh.entity.PageBean;
import com.fh.entity.ResponseServer;
import com.fh.entity.ServerEnum;
import com.fh.entity.TShopProduct;
import com.fh.service.ProductFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName ProductFeignServiceImpl
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/15 14:21
 * @Version 1.0
 **/
@Service("ProductFeignServiceImpl")
public class ProductFeignServiceImpl implements ProductFeignService {

    @Resource
    ProductFeignService productFeignService;

    @Override
    @HystrixCommand(fallbackMethod = "errorFallBack")
    public ResponseServer queryProductList(PageBean<TShopProduct> page) {
        return productFeignService.queryProductList(page);
    }

    public ResponseServer errorFallBack(PageBean<TShopProduct> page) {
        return ResponseServer.error(ServerEnum.HTTP_ERROR);
    }

    @Override
    public ResponseServer addTShopProduct(TShopProduct tShopProduct) {
        return null;
    }

    @Override
    public ResponseServer deleteTShopProductById(TShopProduct tShopProduct) {
        return null;
    }

    @Override
    public ResponseServer updateTShopProductById(TShopProduct tShopProduct) {
        return null;
    }
}
