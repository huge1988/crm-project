package com.qy25.sm.entity;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;


@Data
public class Supplier extends BaseEntity<Long> {

    private String supplierName;

    private String supplierContact;

    private String supplierPhone;

    private String supplierEmail;

    private String supplierAddress;

    private String supplierBrank;

    private String supplierBrankNum;

}