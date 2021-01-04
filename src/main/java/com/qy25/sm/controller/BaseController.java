package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.http.AxiosResult;
import com.qy25.sm.service.BaseService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:45
 */
public class BaseController<T, ID> {

    @Autowired
    private BaseService<T, ID> baseService;


    @GetMapping()
    public AxiosResult<PageVo<T>> findAll(@RequestParam(defaultValue = "1") int currentPage,
                                          @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return AxiosResult.success(baseService.findPage());
    }

    @GetMapping("{id}")
    public AxiosResult<T> findOne(@PathVariable ID id) {
        return AxiosResult.success(baseService.findOne(id));
    }


    @PostMapping
    public AxiosResult<Void> addOne(@RequestBody T entity) {
        return getResult(baseService.addOne(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateOne(@RequestBody T entity) {
        return getResult(baseService.updateOne(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteOne(@PathVariable ID id) {
        return getResult(baseService.deleteOne(id));
    }

    /**
     * 增 删 改 返回值判断
     *
     * @param row
     * @return
     */
    public AxiosResult<Void> getResult(int row) {
        return row > 0 ? AxiosResult.success() : AxiosResult.error();
    }


}
