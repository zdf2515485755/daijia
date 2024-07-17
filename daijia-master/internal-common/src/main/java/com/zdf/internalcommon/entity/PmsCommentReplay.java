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
 * @TableName pms_comment_replay
 */
@TableName(value ="pms_comment_replay")
@Data
public class PmsCommentReplay implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long commentId;

    private Long replyId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}