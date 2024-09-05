package org.leocoder.lease.custom.web.admin.controller.apartment;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.service.AttrValueService;
import org.leocoder.lease.custom.web.admin.vo.attr.AttrKeyVo;
import org.leocoder.lease.model.domain.AttrKey;
import org.leocoder.lease.model.domain.AttrValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 房间属性管理(apartment_attr)表控制层
 */

@Tag(name = "房间属性管理")
@RestController
@RequestMapping("/admin/attr")
@RequiredArgsConstructor
public class AttrController {
    private final AttrValueService attrService;

    @Operation(summary = "新增或更新属性名称")
    @PostMapping("key/saveOrUpdate")
    public Result<Void> saveOrUpdateAttrKey(@RequestBody AttrKey attrKey) {
        return Results.success();
    }

    @Operation(summary = "新增或更新属性值")
    @PostMapping("value/saveOrUpdate")
    public Result<Void> saveOrUpdateAttrValue(@RequestBody AttrValue attrValue) {
        return Results.success();
    }


    @Operation(summary = "查询全部属性名称和属性值列表")
    @GetMapping("list")
    public Result<List<AttrKeyVo>> listAttrInfo() {
        return Results.success(null);
    }

    @Operation(summary = "根据id删除属性名称")
    @DeleteMapping("key/deleteById")
    public Result<Void> removeAttrKeyById(@RequestParam Long attrKeyId) {
        return Results.success();
    }

    @Operation(summary = "根据id删除属性值")
    @DeleteMapping("value/deleteById")
    public Result<Void> removeAttrValueById(@RequestParam Long id) {
        return Results.success();
    }

}
