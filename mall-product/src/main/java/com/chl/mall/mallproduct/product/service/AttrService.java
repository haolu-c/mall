package com.chl.mall.mallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallproduct.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author haoluc
 * @email 229587293@qq.com
 * @date 2023-12-07 20:28:20
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

