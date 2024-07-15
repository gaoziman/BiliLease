package org.leocoder.lease.custom.web.admin.controller.apartment;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.result.Result;
import org.leocoder.lease.model.domain.FacilityInfo;
import org.leocoder.lease.model.enums.ItemType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 公寓&配套关联表(apartment_facility)表控制层
 */

@Tag(name = "配套管理")
@RestController
@RequestMapping("/admin/facility")
public class FacilityController {

    @Operation(summary = "[根据类型]查询配套信息列表")
    @GetMapping("list")
    public Result<List<FacilityInfo>> listFacility(@RequestParam(required = false) ItemType type) {
        return Result.success();
    }

    @Operation(summary = "新增或修改配套信息")
    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody FacilityInfo facilityInfo) {
        return Result.success();
    }

    @Operation(summary = "根据id删除配套信息")
    @DeleteMapping("deleteById")
    public Result removeFacilityById(@RequestParam Long id) {
        return Result.success();
    }

}
