package com.sxmyt.city.service;

import com.sxmyt.city.entity.UserEntity;

import java.util.List;

/**
 * @ClassName UserService
 * @Description 用户service类
 * @Author fzm
 * @Date 2019/5/5 0005 15:55
 * @Version 1.0
 **/
public interface UserService {

    List<UserEntity> getUserList();

}
