package com.sxmyt.city.mapper;

import com.sxmyt.city.entity.Shop;
import com.sxmyt.city.entity.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     *
     * @mbggenerated 2019-05-07
     */
    int countByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int deleteByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int insert(Shop record);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int insertSelective(Shop record);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     *
     * @mbggenerated 2019-05-07
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);
}