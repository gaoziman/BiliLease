package org.leocoder.lease.custom.web.admin.controller.apartment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.vo.apartment.ApartmentDetailVo;
import org.leocoder.lease.custom.web.admin.vo.apartment.ApartmentItemVo;
import org.leocoder.lease.custom.web.admin.vo.apartment.ApartmentQueryVo;
import org.leocoder.lease.custom.web.admin.vo.apartment.ApartmentSubmitVo;
import org.leocoder.lease.model.domain.ApartmentInfo;
import org.leocoder.lease.model.enums.ReleaseStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 公寓信息管理(apartment_info)表控制层
 */

@Tag(name = "公寓信息管理")
@RestController
@RequestMapping("/admin/apartment")
public class ApartmentController {

    @Operation(summary = "保存或更新公寓信息")
    @PostMapping("saveOrUpdate")
    public Result<Void> saveOrUpdate(@RequestBody ApartmentSubmitVo apartmentSubmitVo) {
        return Results.success();
    }

    @Operation(summary = "根据条件分页查询公寓列表")
    @GetMapping("pageItem")
    public Result<IPage<ApartmentItemVo>> pageItem(@RequestParam long current, @RequestParam long size, ApartmentQueryVo queryVo) {
        return Results.success(null);
    }

    @Operation(summary = "根据ID获取公寓详细信息")
    @GetMapping("getDetailById")
    public Result<ApartmentDetailVo> getDetailById(@RequestParam Long id) {
        return Results.success(null);
    }

    @Operation(summary = "根据id删除公寓信息")
    @DeleteMapping("removeById")
    public Result<Void> removeById(@RequestParam Long id) {
        return Results.success();
    }

    @Operation(summary = "根据id修改公寓发布状态")
    @PostMapping("updateReleaseStatusById")
    public Result<Void> updateReleaseStatusById(@RequestParam Long id, @RequestParam ReleaseStatus status) {
        return Results.success();
    }

    @Operation(summary = "根据区县id查询公寓信息列表")
    @GetMapping("listInfoByDistrictId")
    public Result<List<ApartmentInfo>> listInfoByDistrictId(@RequestParam Long id) {
        return Results.success(null);
    }
}














