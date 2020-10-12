package com.atguigu.test1002.test1002.mapper;

import com.atguigu.test1002.test1002.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author JSP
 * @create 2020-10-02 9:37
 */
//mapper 泛型,表示当前mapper要操作实体类
//数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {
}
