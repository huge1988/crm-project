package com.qy25.sm.controller;

import com.qy25.sm.entity.Supplier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:46
 */
@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier, Long> {
}
