package com.sxmyt.city.controller.user;

import com.sxmyt.city.entity.UserEntity;
import com.sxmyt.city.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user_list")
    public Object getUser(){
        List<UserEntity> userList = userService.getUserList();
        return userList;
    }


}
