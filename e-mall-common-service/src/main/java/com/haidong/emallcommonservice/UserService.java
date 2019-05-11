package com.haidong.emallcommonservice;

import com.haidong.emalluser.LoginReq;
import com.haidong.emalluser.UserEntity;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
