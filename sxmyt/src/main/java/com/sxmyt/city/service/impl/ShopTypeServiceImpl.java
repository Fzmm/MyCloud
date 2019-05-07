package com.sxmyt.city.service.impl;/**
 * @title: fzm
 * @projectName sxmyt
 * @description: TODO
 * @author Admin
 * @date 2019/5/723:08
 */

import com.sxmyt.city.entity.ShopType;
import com.sxmyt.city.entity.ShopTypeExample;
import com.sxmyt.city.mapper.ShopTypeMapper;
import com.sxmyt.city.service.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@author fzm
 *@date 2019/5/7
 */
@Service
public class ShopTypeServiceImpl implements ShopTypeService {

    @Autowired
    private ShopTypeMapper shopTypeMapper;

    @Override
    public List<ShopType> getShopType() {
        ShopTypeExample shopTypeExample = new ShopTypeExample();
        return shopTypeMapper.selectByExample(shopTypeExample);
    }
}
