package com.ffwl.concert.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginQuery {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
}
