package com.ihangjing.waimai.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ihangjing.waimai.pojo.BackUser;
import com.ihangjing.waimai.dao.BackUserMapper;
@Service
public class BackUserService implements IBackUserService {

    @Autowired
    private BackUserMapper backUserDao;

    @Override
    public BackUser searchByUserid(Integer id) {
        return backUserDao.selectByPrimaryKey(id);
    }

    /*
    @Override
    public List<BackUser> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }*/
}
