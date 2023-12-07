package com.chl.mall.mallproduct.product.dao;

import com.chl.mall.mallproduct.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author haoluc
 * @email 229587293@qq.com
 * @date 2023-12-07 20:28:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
