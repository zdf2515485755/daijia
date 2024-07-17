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
 * @TableName pms_attr_attr group_relation
 */
@TableName(value ="pms_attr_attrgroup_relation")
@Data
public class PmsAttrAttrgroupRelation implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long attrId;

    private Long attrGroupId;

    private Integer attrSort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}