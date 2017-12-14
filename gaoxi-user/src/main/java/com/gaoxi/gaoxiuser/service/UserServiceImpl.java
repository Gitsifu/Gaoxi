package com.gaoxi.gaoxiuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;

/**
 * @author sifu
 * @version 1.0
 * @date 2017/12/14
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String login(String username) {
        return "username:" + username;
    }
}
