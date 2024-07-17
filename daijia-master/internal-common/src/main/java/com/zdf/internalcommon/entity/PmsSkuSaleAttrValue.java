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
 * @TableName pms_sku_sale_attr_value
 */
@TableName(value ="pms_sku_sale_attr_value")
@Data
public class PmsSkuSaleAttrValue implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    private Long attrId;

    private String attrName;

    private String attrValue;

    private Integer attrSort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}