package com.atguigu.test1002.test1002.service.impl;

import com.atguigu.test1002.test1002.bean.UserInfo;
import com.atguigu.test1002.test1002.mapper.UserInfoMapper;
import com.atguigu.test1002.test1002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * @author JSP
 * @create 2020-10-02 9:42
 */
@Service
public class UserServiceImpl implements UserService {

    //表示当前userInfoMapper在容器中
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        //有选择的添加
        userInfoMapper.insertSelective(userInfo);
    }

;    public void updUser(UserInfo userInfo) {
        //
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updUserByExample(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }

//    @Override
//    public void delUser(UserInfo userInfo) {
//        //delete from userInfo where id = ?
//        userInfoMapper.deleteByPrimaryKey(userInfo);
//    }


//    @Override
//    public void delUser(UserInfo userInfo) {
//        //delete from userInfo where name = ?
//        //example:主要作用就是封装条件
//        Example example = new Example(UserInfo.class);
//        example.createCriteria().andEqualTo("name",userInfo.getName());
//        userInfoMapper.deleteByExample(example);
//    }

    @Override
    public void delUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }
}
