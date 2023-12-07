package com.chl.mall.mallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallproduct.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author haoluc
 * @email 229587293@qq.com
 * @date 2023-12-07 20:28:20
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

