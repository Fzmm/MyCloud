package com.sxmyt.city.service.impl;

import com.sxmyt.city.entity.Shop;
import com.sxmyt.city.entity.ShopExample;
import com.sxmyt.city.mapper.ShopMapper;
import com.sxmyt.city.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fzm
 * @title: ShopServiceImpl
 * @projectName sxmyt
 * @description: TODO
 * @date 2019/5/7  23:48
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> getShop() {
        List<Shop> shops = shopMapper.selectByExample(new ShopExample());
        return shops;
    }
}
