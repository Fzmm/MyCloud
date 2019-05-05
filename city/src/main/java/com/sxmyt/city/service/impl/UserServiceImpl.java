package com.sxmyt.city.service.impl;

import com.sxmyt.city.entity.UserEntity;
import com.sxmyt.city.entity.UserEntityExample;
import com.sxmyt.city.mapper.UserEntityMapper;
import com.sxmyt.city.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description 实现类
 * @Author fzm
 * @Date 2019/5/5 0005 15:55
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public List<UserEntity> getUserList() {
        UserEntityExample userEntityExample = new UserEntityExample();
        return userEntityMapper.selectByExample(userEntityExample);
    }
}
