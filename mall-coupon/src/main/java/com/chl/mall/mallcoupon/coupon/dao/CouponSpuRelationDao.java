package com.chl.mall.mallcoupon.coupon.dao;

import com.chl.mall.mallcoupon.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:51:43
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
