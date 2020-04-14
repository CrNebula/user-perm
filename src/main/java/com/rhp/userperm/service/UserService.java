package com.rhp.userperm.service;

import com.rhp.userperm.entity.User;

public interface UserService {

    User selectByUserName(String userName);
}
