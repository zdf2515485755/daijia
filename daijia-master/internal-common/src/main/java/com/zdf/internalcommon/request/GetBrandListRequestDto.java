package com.zdf.internalcommon.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Description 类功能简要描述
 *@Author mrzhang
 *@Date 2024/6/25 18:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBrandListRequestDto {

    private String brandName;
}
