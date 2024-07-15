package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description : 杂项费用名称表
 */

@Schema(description = "杂项费用名称表")
@Data
@TableName(value = "fee_key")
public class FeeKey extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "`name`")
    @Schema(description = "付款项key")
    private String name;

}