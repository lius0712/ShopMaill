package com.example.shopmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 11:30:34
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

