package com.ffwl.concert.service;

import com.ffwl.concert.vo.UserLoginVO;
import com.ffwl.concert.query.LoginQuery;

public interface UserService {
    UserLoginVO login(LoginQuery loginQuery);

}
