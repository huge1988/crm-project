package com.qy25.sm.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/4 - 21:02
 */
@Data
public class BaseEntity<ID> {
    private ID id;
    private Date creatTime;

    private Long creatId;

    private Date updateTime;

    private Long updateId;

}
