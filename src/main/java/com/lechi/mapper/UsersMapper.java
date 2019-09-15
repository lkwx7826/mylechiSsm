package com.lechi.mapper;

import com.lechi.domain.Users;

/**
 * @InterfaceName UsersMapper
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/10 10:42
 * @Version 1.0
 **/

public interface UsersMapper {

    public void save(Users users);

    public Users findOne(String name);


}
