package com.ffwl.concert.service.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "Wx",url = "https://api.weixin.qq.com")
public interface WxConsumer {

    @RequestMapping(value = "/cgi-bin/token", method = RequestMethod.GET)
    String getAccessToken(@RequestParam("grant_type")String grantType,@RequestParam("appid")String appid,@RequestParam("secret")String secret);

}
