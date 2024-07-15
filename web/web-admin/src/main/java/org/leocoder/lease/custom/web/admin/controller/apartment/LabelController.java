package org.leocoder.lease.custom.web.admin.controller.apartment;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.result.Result;
import org.leocoder.lease.model.domain.LabelInfo;
import org.leocoder.lease.model.enums.ItemType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 公寓标签管理表(apartment_label)表控制层
 */

@Tag(name = "标签管理")
@RestController
@RequestMapping("/admin/label")
public class LabelController {

    @Operation(summary = "（根据类型）查询标签列表")
    @GetMapping("list")
    public Result<List<LabelInfo>> labelList(@RequestParam(required = false) ItemType type) {
        return Result.success();
    }

    @Operation(summary = "新增或修改标签信息")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdateLabel(@RequestBody LabelInfo labelInfo) {

        return Result.success();
    }

    @Operation(summary = "根据id删除标签信息")
    @DeleteMapping("deleteById")
    public Result deleteLabelById(@RequestParam Long id) {
        return Result.success();
    }
}
