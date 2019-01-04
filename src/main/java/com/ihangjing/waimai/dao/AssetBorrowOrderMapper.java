package com.ihangjing.waimai.dao;

import com.ihangjing.waimai.pojo.AssetBorrowOrder;

import java.util.List;
import java.util.Map;

public interface AssetBorrowOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AssetBorrowOrder record);

    int insertSelective(AssetBorrowOrder record);

    AssetBorrowOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AssetBorrowOrder record);

    int updateByPrimaryKeyWithBLOBs(AssetBorrowOrder record);

    int updateByPrimaryKey(AssetBorrowOrder record);

    List<AssetBorrowOrder> queryOrderResouceList(Map<String,Object> params);
}