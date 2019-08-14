package com.ffwl.concert.service.impl;

import com.ffwl.concert.service.WxService;
import com.ffwl.concert.service.consumer.WxConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WxServiceImpl implements WxService {

    @Autowired
    private WxConsumer wxConsumer;

    @Value("${wx.appid}")
    private String appid;

    @Value("${wx.appSecret}")
    private String appSecret;
    @Override
    public String getAccessToken() {
        return wxConsumer.getAccessToken("client_credential",appid,appSecret);
    }
}
