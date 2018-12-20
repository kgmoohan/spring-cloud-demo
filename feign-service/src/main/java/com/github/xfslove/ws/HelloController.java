package com.github.xfslove.ws;

import com.github.xfslove.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanwen on 2017/4/10.
 */
@RestController
public class HelloController {

  @Autowired
  private HelloClient client;

  @RequestMapping("/say-hello")
  public String sayHello() {
    return client.sayHello();
  }
}
