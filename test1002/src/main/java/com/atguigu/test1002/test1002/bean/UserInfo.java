package com.atguigu.test1002.test1002.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author JSP
 * @create 2020-10-02 9:18
 */
@Data
//实体类通常包含：属性，getset
public class UserInfo implements Serializable {
    @Id   //表示主键
    @Column //表示列
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //获取数据库组件自增   //oracle: GenerationType.AUTO
                                                                                //mysql:  GenerationType.IDENTITY
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;

}
