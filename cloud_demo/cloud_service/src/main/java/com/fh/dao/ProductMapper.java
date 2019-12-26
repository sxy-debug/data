package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.PageBean;
import com.fh.entity.ProductParamter;
import com.fh.entity.TShopProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<TShopProduct> {
    Long queryProductCount(@Param("paramter") ProductParamter paramter);

    List<TShopProduct> queryList(@Param("page") PageBean<TShopProduct> page, @Param("paramter") ProductParamter paramter);

    TShopProduct getProductById(Integer productId);
}
