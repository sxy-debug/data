package com.fh.controller;

import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.ResponseServer;
import com.fh.entity.TShopProduct;
import com.fh.service.DemoFeignService;
import com.fh.service.ProductFeignService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ProductFeignController
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/12 14:38
 * @Version 1.0
 **/
@RestController
public class ProductFeignController {
    @Resource(name = "ProductFeignServiceImpl")
    ProductFeignService productFeignService;

    @RequestMapping(value="/product", produces = "application/json;charset=utf-8")
    public ResponseServer product(PageBean<TShopProduct> page) {
        return productFeignService.queryProductList(page);
    }

    @RequestMapping(value="/addProduct", produces = "application/json;charset=utf-8")
    public ResponseServer addProduct(@RequestBody TShopProduct tShopProduct) {
        return productFeignService.addTShopProduct(tShopProduct);
    }

    @RequestMapping(value="/deleteProduct", produces = "application/json;charset=utf-8")
    public ResponseServer deleteProduct(@RequestBody TShopProduct tShopProduct) {
        return productFeignService.deleteTShopProductById(tShopProduct);
    }

    @RequestMapping(value="/updateProduct", produces = "application/json;charset=utf-8")
    public ResponseServer updateProduct(@RequestBody TShopProduct tShopProduct) {
        return productFeignService.updateTShopProductById(tShopProduct);
    }

}
