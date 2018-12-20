package com.github.xfslove.client;

import org.springframework.stereotype.Component;

/**
 * Created by hanwen on 2017/4/10.
 */
@Component
public class HelloServiceFallback implements HelloClient {

  @Override
  public String sayHello() {
    return "Hi Guy! I'm Fallback!";
  }

}
