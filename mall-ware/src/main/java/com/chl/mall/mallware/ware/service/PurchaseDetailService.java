package com.chl.mall.mallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallware.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:56:03
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

