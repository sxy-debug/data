package com.fh.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("t_shop_product")
public class TShopProduct implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField("brand_id")
    private Integer brandId;

    @TableField("name")
    private String name;

    @TableField("subtitle")
    private String subtitle;

    @TableField("main_img")
    private String mainImg;

    @TableField("price")
    private BigDecimal price;

    @TableField("stock")
    private Integer stock;

    @TableField("status")
    private Integer status;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @TableField("update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;


    //展示品牌名称使用
    private String brandName;
    //展示商品类型名称
    private String categroyName;
    //获取商品类型ID
    private String categroyIds;
}