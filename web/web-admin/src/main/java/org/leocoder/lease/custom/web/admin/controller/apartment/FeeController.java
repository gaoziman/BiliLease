package org.leocoder.lease.custom.web.admin.controller.apartment;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.vo.fee.FeeKeyVo;
import org.leocoder.lease.model.domain.FeeKey;
import org.leocoder.lease.model.domain.FeeValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 房间杂费管理(apartment_fee_value)表控制层
 */

@Tag(name = "房间杂费管理")
@RestController
@RequestMapping("/admin/fee")
public class FeeController {

    @Operation(summary = "保存或更新杂费名称")
    @PostMapping("key/saveOrUpdate")
    public Result<Void> saveOrUpdateFeeKey(@RequestBody FeeKey feeKey) {
        return Results.success();
    }

    @Operation(summary = "保存或更新杂费值")
    @PostMapping("value/saveOrUpdate")
    public Result<Void> saveOrUpdateFeeValue(@RequestBody FeeValue feeValue) {
        return Results.success();
    }


    @Operation(summary = "查询全部杂费名称和杂费值列表")
    @GetMapping("list")
    public Result<List<FeeKeyVo>> feeInfoList() {
        return Results.success(null);
    }

    @Operation(summary = "根据id删除杂费名称")
    @DeleteMapping("key/deleteById")
    public Result<Void> deleteFeeKeyById(@RequestParam Long feeKeyId) {
        return Results.success();
    }

    @Operation(summary = "根据id删除杂费值")
    @DeleteMapping("value/deleteById")
    public Result<Void> deleteFeeValueById(@RequestParam Long id) {
        return Results.success();
    }
}
