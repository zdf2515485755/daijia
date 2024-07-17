package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author mrzhang
 * @TableName pms_sku_info
 */
@TableName(value ="pms_sku_info")
@Data
public class PmsSkuInfo implements Serializable {
    /**
     * skuId
     */
    @TableId(type = IdType.AUTO)
    private Long skuId;

    /**
     * spuId
     */
    private Long spuId;

    private String skuName;

    private String skuDesc;

    private Long catalogId;

    private Long brandId;

    private String skuDefaultImg;

    private String skuTitle;

    private String skuSubtitle;

    private BigDecimal price;

    private Long saleCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}