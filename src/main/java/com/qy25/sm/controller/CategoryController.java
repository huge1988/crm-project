package com.qy25.sm.controller;

import com.qy25.sm.entity.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:46
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category, Long> {
}
