package com.stan.service.api;

import com.stan.service.api.impl.IProviderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Stan
 * Date: 2019/11/26 19:38
 * Content: 使用FeignClient 注解
 * @RequestMapping("value") value:跟提供者对应controller一致
 * 接口中写 提供者者的方法
 */

@FeignClient(value = "EUREKA-PROVIDER",fallback = IProviderServiceImpl.class)//调用的微服务名称
public interface IProviderService {

    @RequestMapping("/provider/test/{id}")
    //如果里面有参数 也要一致
    // 请求中存在 REST风格 参数列表中必须给对应的参数添加 @PathVariable("一定要添加请求中对应参数的名字")
    public String test(@PathVariable("id") Integer id);


}
