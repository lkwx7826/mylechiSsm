package com.lechi.controller;

import com.lechi.domain.Users;
import com.lechi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UsersController
 * @Description ToDo
 * @Author WangKe
 * @Date 2019/9/10 16:59
 * @Version 1.0
 **/

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;


    @RequestMapping("/save")
    public String save(Users users){

        usersService.save(users);
        return  "保存成功";
    }


    @RequestMapping("/findone")
    public String findOne(Users users){

        Users one = usersService.findOne(users.getName());



        String password = users.getPassword();

        System.out.println("one"+one);

        System.out.println("user"+users);
        //为啥是fales
        System.out.println(password==one.getPassword());

        if ( ( password != null) && (password.equals(one.getPassword()) )) {
            return  "登陆成功";
        }else {
            return  "密码错误";
        }
    }



}
