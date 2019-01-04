package com.ihangjing.waimai.service;

import com.ihangjing.waimai.pojo.AssetBorrowOrder;

import java.util.List;
import java.util.Map;

public interface IAssetBorrowOrderService {

    List<AssetBorrowOrder> queryOrderResouceList(Map<String,Object> params);
}
