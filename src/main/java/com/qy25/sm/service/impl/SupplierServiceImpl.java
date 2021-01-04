package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Supplier;
import com.qy25.sm.service.SupplierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:43
 */
@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, Long> implements SupplierService {
}
