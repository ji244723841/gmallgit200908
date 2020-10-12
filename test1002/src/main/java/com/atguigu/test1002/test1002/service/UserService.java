package com.atguigu.test1002.test1002.service;

import com.atguigu.test1002.test1002.bean.UserInfo;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author JSP
 * @create 2020-10-02 9:40
 */
//业务逻辑层
public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();
    /**
     *增加
     */
    void addUser(UserInfo userInfo);
    /**
     * 修改
     */
    void updUser(UserInfo userInfo);
    /**
     * 修改by条件
     */
    void updUserByExample(UserInfo userInfo);

    /**
     * 删除
     */
    void delUser(UserInfo userInfo);

}
