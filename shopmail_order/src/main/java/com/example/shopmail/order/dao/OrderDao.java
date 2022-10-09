package com.example.shopmail.order.dao;

import com.example.shopmail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 16:10:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
