package com.skyline.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skyline.springboot.entity.User;

import java.io.IOException;
import java.util.List;

/**
 * @author zhangkepeng
 */
public interface UserService extends IService<User> {

    List<User> getAllUsers();

    int updateUserById(User user);

}
