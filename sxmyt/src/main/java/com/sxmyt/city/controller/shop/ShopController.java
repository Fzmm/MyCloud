package com.sxmyt.city.controller.shop;

import com.github.pagehelper.PageHelper;
import com.sxmyt.city.common.ReturnMessage;
import com.sxmyt.city.entity.Shop;
import com.sxmyt.city.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description 用户控制类
 * @Author fzm
 * @Date 2019/5/5 0005 15:54
 * @Version 1.0
 **/
@RestController
@RequestMapping("shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    /***
     * 分页查询
     * @param pageSize      页面容量
     * @param pageIndex     页面下标
     * @return
     */
    @GetMapping("/page_list")
    public Object getPageInfo(Integer pageSize , Integer pageIndex){
        PageHelper.startPage(pageIndex , pageSize);
        List<Shop> shop = shopService.getShop();
        return new ReturnMessage(shop);
    }

}
