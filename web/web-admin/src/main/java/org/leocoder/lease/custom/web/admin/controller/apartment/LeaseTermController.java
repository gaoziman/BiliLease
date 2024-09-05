package org.leocoder.lease.custom.web.admin.controller.apartment;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.service.LeaseTermService;
import org.leocoder.lease.model.domain.LeaseTerm;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 租期管理表(room_lease_term)表控制层
 */

@Tag(name = "租期管理")
@RequestMapping("/admin/term")
@RestController
@RequiredArgsConstructor
public class LeaseTermController {
    private final LeaseTermService leaseTermService;

    @GetMapping("list")
    @Operation(summary = "查询全部租期列表")
    public Result<List<LeaseTerm>> listLeaseTerm() {
        return Results.success(null);
    }

    @PostMapping("saveOrUpdate")
    @Operation(summary = "保存或更新租期信息")
    public Result<Void> saveOrUpdate(@RequestBody LeaseTerm leaseTerm) {
        return Results.success();
    }

    @DeleteMapping("deleteById")
    @Operation(summary = "根据ID删除租期")
    public Result<Void> deleteLeaseTermById(@RequestParam Long id) {
        return Results.success();
    }
}
