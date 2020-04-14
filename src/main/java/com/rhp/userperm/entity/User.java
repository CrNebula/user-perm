package com.rhp.userperm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String password;
    private String salt;

    @TableField(exist = false)
    private List<Role> roleList;// 一个用户具有多个角色

    @Override
    public String toString() {
        return "User{"  + userId +
                ", " + userName + '\'' +
                ", " + password + '\'' +
                ", " + salt + '\'' +
                ",\n" + roleList +
                '}';
    }
}
