package com.zdf.internalcommon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 客户登录记录
 * @author mrzhang
 * @TableName customer_login_log
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value ="customer_login_log")
@Data
public class CustomerLoginLog extends BaseEntity implements Serializable {
    /**
     * 访问ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 客户id
     */
    private String customerId;

    /**
     * 登录IP地址
     */
    private String ipaddr;

    /**
     * 登录状态
     */
    private Integer status;

    /**
     * 提示信息
     */
    private String msg;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}