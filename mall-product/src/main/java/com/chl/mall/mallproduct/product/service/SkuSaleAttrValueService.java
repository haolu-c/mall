package com.chl.mall.mallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallproduct.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author haoluc
 * @email 229587293@qq.com
 * @date 2023-12-07 20:28:20
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

