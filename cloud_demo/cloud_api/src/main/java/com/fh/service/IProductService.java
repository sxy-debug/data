package com.fh.service;

import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.ResponseServer;
import com.fh.entity.TShopProduct;

public interface IProductService {
    PageBean<TShopProduct> queryProductPageList(PageBean<TShopProduct> page, ProductParamter paramter);

    ResponseServer addTShopProduct(TShopProduct tShopProduct);

    ResponseServer deleteTShopProductById(TShopProduct tShopProduct);

    ResponseServer updateTShopProductById(TShopProduct tShopProduct);
}