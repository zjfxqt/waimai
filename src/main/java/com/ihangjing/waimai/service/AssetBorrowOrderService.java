package com.ihangjing.waimai.service;

import com.github.pagehelper.PageHelper;
import com.ihangjing.waimai.dao.AssetBorrowOrderMapper;
import com.ihangjing.waimai.pojo.AssetBorrowOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AssetBorrowOrderService implements IAssetBorrowOrderService {
    @Autowired
    private AssetBorrowOrderMapper assetBorrowOrderDao;

    @Override
    public List<AssetBorrowOrder> queryOrderResouceList(Map<String,Object> params) {
        PageHelper.startPage(Integer.parseInt(params.get("page").toString()), Integer.parseInt(params.get("rows").toString()));
        return this.assetBorrowOrderDao.queryOrderResouceList(params);
    }
}
