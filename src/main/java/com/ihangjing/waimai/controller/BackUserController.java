package com.ihangjing.waimai.controller;

import com.ihangjing.waimai.pojo.BackUser;
import com.ihangjing.waimai.service.IBackUserService;
import com.ihangjing.waimai.util.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 管理员服务
 * @author zhengjianfeng
 */
@RequestMapping("/back")
@RestController
public class BackUserController {

    @Autowired
    private IBackUserService backUserService;

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {

        Integer id =  Integer.parseInt(request.getParameter("id"));

        BackUser backUser = backUserService.searchByUserid(id);

        String userstring = JSONUtil.beanToJson(backUser);

        return userstring;
    }
}
