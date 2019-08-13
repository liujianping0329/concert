package com.ffwl.concert.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserLoginVO {
    private Long userId;

    private String username;

    @ApiModelProperty("部门ID")
    private Long deptId;

    @ApiModelProperty("警员编号")
    private String policeno;
}
