package com.sxmyt.city.service;

import com.sxmyt.city.entity.ShopType;

import java.util.List;

/**
 * @author fzm
 * @title: ShopTypeService
 * @projectName sxmyt
 * @description: TODO
 * @date 2019/5/723:07
 */
public interface ShopTypeService {

    /***
     * 后期商品类别信息
     * @return
     */
    List<ShopType> getShopType();
}
