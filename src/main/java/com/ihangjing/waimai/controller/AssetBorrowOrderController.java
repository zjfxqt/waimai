package com.ihangjing.waimai.controller;

import com.github.pagehelper.PageInfo;
import com.ihangjing.waimai.pojo.AssetBorrowOrder;
import com.ihangjing.waimai.service.IAssetBorrowOrderService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员服务
 *
 * @author zhengjianfeng
 */
@RequestMapping("/back")
@RestController
public class AssetBorrowOrderController {

    @Autowired
    private IAssetBorrowOrderService assetBorrowOrderService;

    @RequestMapping("/listorder")
    public String queryOrderResouceList(HttpServletRequest request, HttpServletResponse response) {

        // 取得当前页数,注意这是jqgrid自身的参数
        String page = request.getParameter("page");
        // 取得每页显示行数，,注意这是jqgrid自身的参数
        String rows   = request.getParameter("rows");
        String author = request.getParameter("tel");
        String title  = request.getParameter("type");

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", page);
        params.put("rows", rows);
        params.put("user_phone", author);
        params.put("order_type", title);

        List<AssetBorrowOrder>     learnList = this.assetBorrowOrderService.queryOrderResouceList(params);
        PageInfo<AssetBorrowOrder> pageInfo  = new PageInfo<AssetBorrowOrder>(learnList);
        JSONObject                 jo        = new JSONObject();
        jo.put("rows", learnList);
        jo.put("total", pageInfo.getPages());
        jo.put("records", pageInfo.getTotal());

        return jo.toString();
    }
}
