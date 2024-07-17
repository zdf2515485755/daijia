package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * Ʒ?
 * @author mrzhang
 * @TableName pms_brand
 */
@TableName(value ="pms_brand")
@Data
public class PmsBrand implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long brandId;

    private String name;

    private String logo;

    private String descript;

    private Integer showStatus;

    private String firstLetter;

    private Integer sort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}