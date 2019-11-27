package com.stan.service.api.impl;

import com.stan.service.api.IProviderService;
import org.springframework.stereotype.Component;

/**
 * Author: Stan
 * Date: 2019/11/26 21:59
 * Content:
 */
@Component //注入到IOC
public class IProviderServiceImpl implements IProviderService {

    @Override
    public String test(Integer id) {
        return "服务调度失败，请重试"+id;
    }
}
