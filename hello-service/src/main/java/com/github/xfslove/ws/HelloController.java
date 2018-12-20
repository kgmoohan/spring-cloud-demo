package com.github.xfslove.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanwen on 2017/4/10.
 */
@RestController
public class HelloController {

  @Autowired
  private DiscoveryClient client;

  @RequestMapping(value = "/say-hello", method = RequestMethod.GET)
  public String sayHello() {
    ServiceInstance localInstance = client.getLocalServiceInstance();
    return "Hi Guy! I'm : " + localInstance.getServiceId() + ":" + localInstance.getHost() + ":" + localInstance.getPort();
  }

}
