package com.sxmyt.city.controller.shopType;
/**
 * @title: ShopTypeController
 * @projectName sxmyt
 * @description: TODO
 * @author fzm
 * @date 2019/5/723:38
 */

import com.sxmyt.city.common.ReturnMessage;
import com.sxmyt.city.entity.ShopType;
import com.sxmyt.city.service.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop_type")
public class ShopTypeController {

    @Autowired
    private ShopTypeService shopTypeService;

    @RequestMapping("/get_list")
    public Object getShopType(){
        List<ShopType> shopType = shopTypeService.getShopType();
        return new ReturnMessage(shopType);
    }
}
