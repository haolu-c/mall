package com.chl.mall.mallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallorder.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:38:48
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

