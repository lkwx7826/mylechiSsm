package com.lechi.service.impl;

import com.lechi.domain.Users;
import com.lechi.mapper.UsersMapper;
import com.lechi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UsersImpl
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/10 10:54
 * @Version 1.0
 **/

@Service
public class UsersImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void save(Users users) {

        usersMapper.save(users);
    }

    public Users findOne(String name) {
        Users users = usersMapper.findOne(name);

        return users;
    }
}
