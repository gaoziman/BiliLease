package org.leocoder.lease.model.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-07-14 21:47
 * @description :    浏览历史
 */

@Schema(description = "浏览历史")
@Data
@TableName(value = "browsing_history")
public class BrowsingHistory extends BaseDO {
    private static final long serialVersionUID = 1L;

    @TableField(value = "user_id")
    @Schema(description = "用户id")
    private Long userId;


    @TableField(value = "room_id")
    @Schema(description = "浏览房间id")
    private Long roomId;

    @TableField(value = "browse_time")
    @Schema(description = "")
    private Date browseTime;


}