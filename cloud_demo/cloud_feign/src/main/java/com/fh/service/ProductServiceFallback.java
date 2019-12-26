package com.fh.service;

import com.fh.entity.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoServiceFallback
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/11 14:48
 * @Version 1.0
 **/
@Component
public class ProductServiceFallback implements ProductFeignService {

    @Override
    public ResponseServer queryProductList(PageBean<TShopProduct> page) {
        return ResponseServer.error(ServerEnum.HTTP_ERROR);
    }

    @Override
    public ResponseServer addTShopProduct(TShopProduct tShopProduct) {
        return ResponseServer.error(ServerEnum.HTTP_ERROR);
    }

    @Override
    public ResponseServer deleteTShopProductById(TShopProduct tShopProduct) {
        return ResponseServer.error(ServerEnum.HTTP_ERROR);
    }

    @Override
    public ResponseServer updateTShopProductById(TShopProduct tShopProduct) {
        return ResponseServer.error(ServerEnum.HTTP_ERROR);
    }
}
