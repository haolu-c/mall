package com.chl.mall.mallorder.order.dao;

import com.chl.mall.mallorder.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:38:48
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
