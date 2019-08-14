package com.ffwl.concert.controller;

import com.ffwl.concert.query.LoginQuery;
import com.ffwl.concert.response.BaseResponse;
import com.ffwl.concert.service.UserService;
import com.ffwl.concert.service.WxService;
import com.ffwl.concert.vo.UserLoginVO;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/wx")
public class WxController {
    @Resource
    private HttpServletRequest request;

    @Autowired
    private WxService wxService;

    @ApiOperation(value = "微信回调", tags = "微信")
    @RequestMapping(value = "/callback", method = RequestMethod.GET)
    @SneakyThrows
    public String callback(@RequestParam("signature") String signature,
                                              @RequestParam("echostr") String echostr,
                                              @RequestParam("timestamp") String timestamp,
                                              @RequestParam("nonce") String nonce) {
//        String token="fflw";
//        List<String> list=new ArrayList<String>(){{
//           add(token);
//           add(timestamp);
//           add(nonce);
//        }};
//        Collections.sort(list);
//        String content="";
//        for (String s : list) {
//            content+=s;
//        }
//        MessageDigest md=MessageDigest.getInstance("SHA-1");
//        content=byteToStr(md.digest(content.getBytes()));
//        if(content.equals(signature)){
//
//        }
//        https://mp.weixin.qq.com/advanced/advanced?action=dev&t=advanced/dev&token=883518662&lang=zh_CN
        return echostr;
    }

    @ApiOperation(value = "获取accessToken", tags = "微信")
    @RequestMapping(value = "/get/accessToken", method = RequestMethod.GET)
    public String getAccessToken() {
        return wxService.getAccessToken();
    }
    /**
     * 将字节数组转换为十六进制字符串
     *
     * @param byteArray
     * @return
     */
    private static String byteToStr(byte[] byteArray) {
        String strDigest = "";
        for (int i = 0; i < byteArray.length; i++) {
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    /**
     * 将字节转换为十六进制字符串
     */
    private static String byteToHexStr(byte mByte) {
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] tempArr = new char[2];
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tempArr[1] = Digit[mByte & 0X0F];
        String s = new String(tempArr);
        return s;
    }



}
