package com.atguigu.test1002.test1002.controller;

import com.atguigu.test1002.test1002.bean.UserInfo;
import com.atguigu.test1002.test1002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JSP
 * @create 2020-10-02 9:50
 */
@RestController
public class UserController {
    //调用服务处
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setLoginName("jsp");
        userInfo.setPasswd("666666");
        userService.addUser(userInfo);
        System.out.println(userInfo.getId());
    }

    @RequestMapping("updUser")
    public String UpdUser(UserInfo userInfo){
        userInfo.setName("1002 优秀");
        userInfo.setId("5");
        userService.updUser(userInfo);
        return "OK";
    }

    @RequestMapping("updUserByExample")
    public String UpdUserByExample(UserInfo userInfo){
        userInfo.setName("1002 优秀");
        userInfo.setLoginName("adminjsp");
        userService.updUserByExample(userInfo);
        return "OK";
    }

    //localhost:8080/delUser?id=4可以删除
    /**
     * spring方式中的一种
     * @param userInfo
     * @return
     */
    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByName")
    public String delUserByName(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByNickName")
    public String delUserByNickName(UserInfo userInfo){
        userService.delUser(userInfo);
        return "OK";
    }
}
