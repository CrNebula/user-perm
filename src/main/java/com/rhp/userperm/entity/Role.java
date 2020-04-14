package com.rhp.userperm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@TableName("role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @TableId(type = IdType.AUTO)
    private Integer roleId;
    private String roleName;

    //角色 -- 权限关系：多对多关系;
    @TableField(exist = false)
    private List<Permission> permissions;

    @Override
    public String toString() {
        return "Role{" + roleId +
                ", " + roleName + '\'' +
                ", " + permissions +
                '}';
    }
}
