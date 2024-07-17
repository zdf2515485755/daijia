package com.zdf.internalcommon.response;

import com.zdf.internalcommon.entity.PmsCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *@Description 类功能简要描述
 *@Author mrzhang
 *@Date 2024/6/24 13:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryWithTreeVo extends PmsCategory {
    private List<CategoryWithTreeVo> childNode;
}
