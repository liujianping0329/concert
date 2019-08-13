package com.ffwl.concert.controller;

import com.ffwl.concert.vo.UserLoginVO;
import com.ffwl.concert.query.LoginQuery;
import com.ffwl.concert.response.BaseResponse;
import com.ffwl.concert.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登陆", tags = "基本接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<UserLoginVO> login(@RequestBody LoginQuery loginQuery) {
        UserLoginVO login = userService.login(loginQuery);
        request.getSession().setAttribute("userInfo",login);
        return new BaseResponse<>(login);
    }



}
