package com.skyline.springboot.controller;

import com.skyline.springboot.entity.User;
import com.skyline.springboot.service.UserService;
import com.skyline.springboot.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangkepeng
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllUsers")
    public R getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return R.ok().put("userList", userList);
    }

    @RequestMapping("updateUserById")
    public R updateUserById(User user){
        int rows = userService.updateUserById(user);
        return R.ok().put("rows", rows);
    }
}
