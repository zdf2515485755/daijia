package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author mrzhang
 * @TableName pms_spu_info_desc
 */
@TableName(value ="pms_spu_info_desc")
@Data
public class PmsSpuInfoDesc implements Serializable {

    @TableId
    private Long spuId;

    private String decript;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}