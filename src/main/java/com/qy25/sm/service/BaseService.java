package com.qy25.sm.service;

import com.qy25.sm.vo.PageVo;

import java.util.List;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:26
 */
public interface BaseService<T, ID> {


    /**
     * 分页查询全部
     *
     * @return
     */
    PageVo<T> findPage();

    /**
     * 分页 条件查询
     *
     * @param ex
     * @return
     */
    PageVo<T> findPage(Object ex);


    /**
     * 根据id查询单个
     *
     * @param id
     * @return
     */
    T findOne(ID id);

    /**
     * 新增一个
     *
     * @param entity
     * @return
     */
    int addOne(T entity);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    int addMore(List<T> list);


    /**
     * 更新单个
     *
     * @param entity
     * @return
     */
    int updateOne(T entity);


    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    int updateMore(List<T> list);


    /**
     * 根据id删除单个
     *
     * @param id
     * @return
     */
    int deleteOne(ID id);

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    int deleteMore(List<ID> ids);

    /**
     * 封装方法 返回封装号的pageVo
     * @param list
     * @return
     */
    PageVo<T> getPage(List<T> list);
}
