package com.rhp.userperm.mapper;

import com.rhp.userperm.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectByUserName(String userName);
}
