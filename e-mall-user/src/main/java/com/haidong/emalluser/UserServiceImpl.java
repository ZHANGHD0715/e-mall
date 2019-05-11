package com.haidong.emalluser;

import com.alibaba.dubbo.config.annotation.Service;
import com.haidong.emallcommonservice.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity login(LoginReq loginReq) {
        return new UserEntity();
    }
}
