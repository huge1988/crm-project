package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.service.BrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jiuzhe
 * @Date: 2021/1/3 - 16:42
 */
@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand, Long> implements BrandService {
}
