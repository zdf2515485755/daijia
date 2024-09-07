package com.zdf.internalcommon.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Description UpdateUserPhoneDto
 *@Author mrzhang
 *@Date 2024/9/5 21:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserPhoneDto {
    private Long userId;
    private String code;
}
