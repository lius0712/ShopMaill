package com.example.shopmail.member.dao;

import com.example.shopmail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 16:12:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
