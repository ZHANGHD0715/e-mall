package com.haidong.emallcontroller;

import com.alibaba.dubbo.rpc.Result;
import com.haidong.emalluser.LoginReq;

import javax.servlet.http.HttpServletResponse;

public interface UserController {
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
