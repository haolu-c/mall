package com.chl.mall.mallmember.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chl.common.utils.PageUtils;
import com.chl.mall.mallmember.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author haoluc
 * @email 
 * @date 2023-12-07 21:53:08
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

