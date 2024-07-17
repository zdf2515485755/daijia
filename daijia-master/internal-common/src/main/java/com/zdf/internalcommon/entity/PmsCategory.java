package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author mrzhang
 * @TableName pms_category
 */
@TableName(value ="pms_category")
@Data
public class PmsCategory implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long catId;

    private String name;

    private Long parentCid;

    private Integer catLevel;
    @TableLogic
    private Integer showStatus;

    private Integer sort;

    private String icon;

    private String productUnit;

    private Integer productCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}