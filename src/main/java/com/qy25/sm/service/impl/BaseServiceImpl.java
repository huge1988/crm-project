package com.qy25.sm.service.impl;

import com.github.pagehelper.PageInfo;
import com.qy25.sm.mapper.BaseMapper;
import com.qy25.sm.service.BaseService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:32
 */
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {


    @Autowired
    private BaseMapper<T, ID> baseMapper;

    @Override
    public PageVo<T> findPage() {
        return getPage(baseMapper.selectByExample(null));
    }

    @Override
    public PageVo<T> findPage(Object ex) {
        return getPage(baseMapper.selectByExample(ex));
    }

    @Override
    public T findOne(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addOne(T entity) {
        return baseMapper.insert(entity);
    }

    @Override
    public int addMore(List<T> list) {
        list.forEach(item -> baseMapper.insert(item));
        return 1;
    }

    @Override
    public int updateOne(T entity) {
        return baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int updateMore(List<T> list) {
        list.forEach(item -> baseMapper.updateByPrimaryKeySelective(item));
        return 1;
    }

    @Override
    public int deleteOne(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteMore(List<ID> ids) {
        ids.forEach(id -> baseMapper.deleteByPrimaryKey(id));
        return 1;
    }

    @Override
    public PageVo<T> getPage(List<T> list) {
        PageInfo<T> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        PageVo<T> pageVo = new PageVo<>();
        pageVo.setTotal(total);
        pageVo.setList(list);
        return pageVo;
    }
}
