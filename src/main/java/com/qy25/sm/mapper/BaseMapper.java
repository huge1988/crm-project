package com.qy25.sm.mapper;



import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:22
 */
public interface BaseMapper<T,ID> {

    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
