package com.zdf.internalcommon.response;

import com.zdf.internalcommon.entity.CustomerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *@Description UserInfoVo
 *@Author mrzhang
 *@Date 2024/9/1 22:18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVo extends CustomerInfo {
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
}
