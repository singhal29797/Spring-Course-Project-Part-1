package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.UserDAO;
import com.upgrad.hirewheels.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserDAO userDAO;
}
