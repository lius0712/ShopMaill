package com.example.shopmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.shopmail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lls
 * @email lls@gmail.com
 * @date 2022-10-09 16:14:48
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

