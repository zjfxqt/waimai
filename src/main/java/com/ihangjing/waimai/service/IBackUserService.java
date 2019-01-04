package com.ihangjing.waimai.service;

import com.ihangjing.waimai.pojo.BackUser;

public interface IBackUserService {

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    BackUser searchByUserid(Integer id);
}
