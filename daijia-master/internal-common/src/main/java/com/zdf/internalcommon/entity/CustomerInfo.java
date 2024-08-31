package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 客户表
 * @author mrzhang
 * @TableName customer_info
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="customer_info")
@Data
public class CustomerInfo extends BaseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 微信openId
     */
    private String wxOpenId;

    /**
     * 客户昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 电话
     */
    private String phone;

    /**
     * 1有效，2禁用
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}