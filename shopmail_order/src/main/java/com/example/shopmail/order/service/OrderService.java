package com.example.shopmail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 16:10:45
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

