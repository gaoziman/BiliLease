package org.leocoder.lease.custom.web.admin.controller.apartment;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.vo.room.RoomDetailVo;
import org.leocoder.lease.custom.web.admin.vo.room.RoomItemVo;
import org.leocoder.lease.custom.web.admin.vo.room.RoomQueryVo;
import org.leocoder.lease.custom.web.admin.vo.room.RoomSubmitVo;
import org.leocoder.lease.model.domain.RoomInfo;
import org.leocoder.lease.model.enums.ReleaseStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 房间信息管理(room_info)表控制层
 */

@Tag(name = "房间信息管理")
@RestController
@RequestMapping("/admin/room")
public class RoomController {

    @Operation(summary = "保存或更新房间信息")
    @PostMapping("saveOrUpdate")
    public Result<Void> saveOrUpdate(@RequestBody RoomSubmitVo roomSubmitVo) {
        return Results.success();
    }

    @Operation(summary = "根据条件分页查询房间列表")
    @GetMapping("pageItem")
    public Result<IPage<RoomItemVo>> pageItem(@RequestParam long current, @RequestParam long size, RoomQueryVo queryVo) {
        return Results.success(null);
    }

    @Operation(summary = "根据id获取房间详细信息")
    @GetMapping("getDetailById")
    public Result<RoomDetailVo> getDetailById(@RequestParam Long id) {
        return Results.success(null);
    }

    @Operation(summary = "根据id删除房间信息")
    @DeleteMapping("removeById")
    public Result<Void> removeById(@RequestParam Long id) {
        return Results.success();
    }

    @Operation(summary = "根据id修改房间发布状态")
    @PostMapping("updateReleaseStatusById")
    public Result<Void> updateReleaseStatusById(Long id, ReleaseStatus status) {
        return Results.success();
    }

    @GetMapping("listBasicByApartmentId")
    @Operation(summary = "根据公寓id查询房间列表")
    public Result<List<RoomInfo>> listBasicByApartmentId(Long id) {
        return Results.success(null);
    }

}


















