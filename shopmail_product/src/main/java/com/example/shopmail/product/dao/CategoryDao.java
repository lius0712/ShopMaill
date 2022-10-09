package com.example.shopmail.product.dao;

import com.example.shopmail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 11:30:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
