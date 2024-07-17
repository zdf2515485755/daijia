package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author mrzhang
 * @TableName pms_sku_images
 */
@TableName(value ="pms_sku_images")
@Data
public class PmsSkuImages implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    private String imgUrl;

    private Integer imgSort;

    private Integer defaultImg;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}