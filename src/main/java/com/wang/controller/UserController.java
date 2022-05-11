package com.wang.controller;


import com.wang.common.lang.Result;
import com.wang.entity.User;
import com.wang.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王航
 * @since 2022-05-11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(user);
    }
}
