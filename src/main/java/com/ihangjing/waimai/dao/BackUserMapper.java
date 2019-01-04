package com.ihangjing.waimai.dao;

import com.ihangjing.waimai.pojo.BackUser;

public interface BackUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackUser record);

    int insertSelective(BackUser record);

    BackUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackUser record);

    int updateByPrimaryKey(BackUser record);
}