package com.qy25.sm.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:26
 */
@Data
public class PageVo<T> {

    private long total;
    private List<T> list;
}
