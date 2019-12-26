package com.fh.controller;

import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.ResponseServer;
import com.fh.entity.TShopProduct;
import com.fh.service.IProductController;
import com.fh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
public class ProductController implements IProductController {

    @Autowired
    private IProductService productService;

    @Override
    public ResponseServer queryProductList(PageBean<TShopProduct> page) {
        ProductParamter paramter = new ProductParamter();
        paramter.setCateId(page.getCateId());
        paramter.setBrandId(page.getBrandId());
        page=productService.queryProductPageList(page,paramter);
        return ResponseServer.success(page);
    }

    @Override
    public ResponseServer addTShopProduct(TShopProduct tShopProduct) {
        return productService.addTShopProduct(tShopProduct);
    }

    @Override
    public ResponseServer deleteTShopProductById(TShopProduct tShopProduct) {
        return productService.deleteTShopProductById(tShopProduct);
    }

    @Override
    public ResponseServer updateTShopProductById(TShopProduct tShopProduct) {
        return productService.updateTShopProductById(tShopProduct);
    }

}