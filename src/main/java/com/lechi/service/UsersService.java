package com.lechi.service;

import com.lechi.domain.Users;

/**
 * @InterfaceName UsersService
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/10 10:52
 * @Version 1.0
 **/

public interface UsersService {

    public void save(Users users);

    public Users findOne(String name);
}
