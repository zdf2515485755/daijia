package com.zdf.internalcommon.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@Description 类功能简要描述
 *@Author mrzhang
 *@Date 2024/6/25 18:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandAndCategroyRelationVo {
    private Long brandId;
    private String brandName;
    private String categoryName;
}
