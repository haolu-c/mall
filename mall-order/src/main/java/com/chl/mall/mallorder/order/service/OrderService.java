package com.chl.mall.mallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallorder.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:38:48
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

