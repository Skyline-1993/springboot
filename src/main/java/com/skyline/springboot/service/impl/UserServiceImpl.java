package com.skyline.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skyline.springboot.entity.User;
import com.skyline.springboot.mapper.UserMapper;
import com.skyline.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author zhangkepeng
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> getAllUsers() {
        List<User> userList = this.baseMapper.selectList(new QueryWrapper<User>().gt("id", 0));
        return userList;
    }

    @Override
    @Transactional
    public int updateUserById(User user) {
        int rows = this.baseMapper.updateById(user);
        // throw new IOException("模拟 IO 错误");
        return 0;
    }
}
