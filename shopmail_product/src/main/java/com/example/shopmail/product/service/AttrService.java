package com.example.shopmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 11:30:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

