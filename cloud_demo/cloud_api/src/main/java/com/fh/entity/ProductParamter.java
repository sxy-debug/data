package com.fh.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProductParamter implements Serializable {


    private Integer cateId;

    private Integer brandId;
}
