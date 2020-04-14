package com.rhp.userperm.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("permission")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permission {

    @TableId(type = IdType.AUTO)
    private Integer permId;
    private String permName;
    private Integer parentId;
    private String permission;
    private String url;
}
