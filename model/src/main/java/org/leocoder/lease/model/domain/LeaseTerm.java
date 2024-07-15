package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:48
 * @description : 租期
 */

@Schema(description = "租期")
@Data
@TableName(value = "lease_term")
public class LeaseTerm extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @TableField(value = "month_count")
    @Schema(description = "租期")
    private Integer monthCount;


    @TableField(value = "unit")
    @Schema(description = "租期单位")
    private String unit;
}