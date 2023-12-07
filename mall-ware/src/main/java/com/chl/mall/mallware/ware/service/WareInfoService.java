package com.chl.mall.mallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallware.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:56:03
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

