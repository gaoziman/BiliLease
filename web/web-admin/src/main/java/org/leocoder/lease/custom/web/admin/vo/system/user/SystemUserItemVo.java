package org.leocoder.lease.custom.web.admin.vo.system.user;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.leocoder.lease.model.domain.SystemUser;


@Data
@Schema(description = "后台管理系统用户基本信息实体")
public class SystemUserItemVo extends SystemUser {

    @Schema(description = "岗位名称")
    @TableField(value = "post_name")
    private String postName;

}
