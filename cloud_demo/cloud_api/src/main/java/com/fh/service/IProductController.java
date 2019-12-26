package com.fh.service;

import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.ResponseServer;
import com.fh.entity.TShopProduct;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @ClassName ProductController
 * @Description TODO
 * @Author 孙新宇
 * @Date 2019/12/11 20:51
 * @Version 1.0
 **/
public interface IProductController {
    @RequestMapping(value="/products/queryProductList",method = RequestMethod.POST)
    ResponseServer queryProductList(@RequestBody PageBean<TShopProduct> page);

    @RequestMapping(value = "/products/addTShopProduct",method = RequestMethod.POST)
    ResponseServer addTShopProduct(@RequestBody TShopProduct tShopProduct);

    @RequestMapping(value = "/products/deleteTShopProductById",method = RequestMethod.POST)
    ResponseServer deleteTShopProductById(@RequestBody TShopProduct tShopProduct);

    @RequestMapping(value = "/products/updateTShopProductById",method = RequestMethod.POST)
    ResponseServer updateTShopProductById(@RequestBody TShopProduct tShopProduct);
}
