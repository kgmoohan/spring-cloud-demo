package com.github.xfslove.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hanwen on 2017/4/10.
 */
@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface HelloClient {

  @RequestMapping(value = "/say-hello", method = RequestMethod.GET)
  String sayHello();
}
