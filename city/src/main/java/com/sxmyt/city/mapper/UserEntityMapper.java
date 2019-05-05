package com.sxmyt.city.mapper;

import com.sxmyt.city.entity.UserEntity;
import com.sxmyt.city.entity.UserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper {
    /**
     *
     * @mbggenerated 2019-05-05
     */
    int countByExample(UserEntityExample example);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    int deleteByExample(UserEntityExample example);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    int insert(UserEntity record);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    int insertSelective(UserEntity record);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    List<UserEntity> selectByExample(UserEntityExample example);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    int updateByExampleSelective(@Param("record") UserEntity record, @Param("example") UserEntityExample example);

    /**
     *
     * @mbggenerated 2019-05-05
     */
    int updateByExample(@Param("record") UserEntity record, @Param("example") UserEntityExample example);
}