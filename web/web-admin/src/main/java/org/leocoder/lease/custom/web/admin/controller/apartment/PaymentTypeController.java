package org.leocoder.lease.custom.web.admin.controller.apartment;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.leocoder.lease.common.convention.result.Result;
import org.leocoder.lease.common.convention.result.Results;
import org.leocoder.lease.custom.web.admin.service.PaymentTypeService;
import org.leocoder.lease.model.domain.PaymentType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author : 程序员Leo
 * @version 1.0
 * @date 2024-07-14 21:50
 * @description : 支付方式管理表(payment_type)表控制层
 */

@Tag(name = "支付方式管理")
@RequestMapping("/admin/payment")
@RestController
@RequiredArgsConstructor
public class PaymentTypeController {
    private final PaymentTypeService service;

    @Resource
    private PaymentTypeService paymentTypeService;

    @Operation(summary = "查询全部支付方式列表")
    @GetMapping("list")
    public Result<List<PaymentType>> listPaymentType() {
        return Results.success(paymentTypeService.list());
    }

    @Operation(summary = "保存或更新支付方式")
    @PostMapping("saveOrUpdate")
    public Result<Void> saveOrUpdatePaymentType(@RequestBody PaymentType paymentType) {
        return Results.success();
    }

    @Operation(summary = "根据ID删除支付方式")
    @DeleteMapping("deleteById")
    public Result<Void> deletePaymentById(@RequestParam Long id) {
        return Results.success();
    }

}















