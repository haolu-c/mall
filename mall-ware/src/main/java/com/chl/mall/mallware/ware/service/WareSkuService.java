package com.chl.mall.mallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallware.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:56:03
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

