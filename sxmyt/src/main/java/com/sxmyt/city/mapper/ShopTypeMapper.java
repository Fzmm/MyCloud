package com.sxmyt.city.mapper;

import com.sxmyt.city.entity.ShopType;
import com.sxmyt.city.entity.ShopTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopTypeMapper {
    /**
     *
     * @mbggenerated 2019-05-07
     */
    int countByExample(ShopTypeExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int deleteByExample(ShopTypeExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int insert(ShopType record);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int insertSelective(ShopType record);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    List<ShopType> selectByExample(ShopTypeExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int updateByExampleSelective(@Param("record") ShopType record, @Param("example") ShopTypeExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int updateByExample(@Param("record") ShopType record, @Param("example") ShopTypeExample example);
}