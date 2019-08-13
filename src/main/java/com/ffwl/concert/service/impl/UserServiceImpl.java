package com.ffwl.concert.service.impl;

import com.ffwl.concert.exception.ConcertException;
import com.ffwl.concert.response.ResponseEnum;
import com.ffwl.concert.service.UserService;
import com.ffwl.concert.vo.UserLoginVO;
import com.ffwl.concert.query.LoginQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserLoginVO login(LoginQuery loginQuery) {
        UserLoginVO userLoginVO=new UserLoginVO();
        return userLoginVO;
    }
}
