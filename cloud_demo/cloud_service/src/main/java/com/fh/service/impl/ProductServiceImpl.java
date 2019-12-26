package com.fh.service.impl;

import com.fh.dao.ProductMapper;
import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.ResponseServer;
import com.fh.entity.TShopProduct;
import com.fh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public PageBean<TShopProduct> queryProductPageList(PageBean<TShopProduct> page, ProductParamter paramter) {
        //查询总条数
        Long count=productMapper.queryProductCount(paramter);
        page.setRecordsFiltered(count);
        page.setRecordsTotal(count);
        //查询分页数据
        List<TShopProduct> productList=productMapper.queryList(page,paramter);
        page.setData(productList);
        return page;
    }

    @Override
    public ResponseServer addTShopProduct(TShopProduct tShopProduct) {
        productMapper.insert(tShopProduct);
        return ResponseServer.success();
    }

    @Override
    public ResponseServer deleteTShopProductById(TShopProduct tShopProduct) {
        productMapper.deleteById(tShopProduct);
        return ResponseServer.success();
    }

    @Override
    public ResponseServer updateTShopProductById(TShopProduct tShopProduct) {
        productMapper.updateById(tShopProduct);
        return ResponseServer.success();
    }

}
