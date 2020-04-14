package com.rhp.userperm.service.impl;


import com.rhp.userperm.entity.User;
import com.rhp.userperm.mapper.UserMapper;
import com.rhp.userperm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public User selectByUserName(String userName) {
        return mapper.selectByUserName(userName);
    }
}
