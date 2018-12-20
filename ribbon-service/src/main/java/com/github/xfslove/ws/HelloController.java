package com.github.xfslove.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanwen on 2017/4/10.
 */
@RestController
public class HelloController {

  @Autowired
  private ConsumerService consumerService;

  @GetMapping("/say-hello")
  public String hello() {
    return consumerService.consumer();
  }

}
