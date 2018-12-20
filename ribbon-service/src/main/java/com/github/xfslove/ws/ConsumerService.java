package com.github.xfslove.ws;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

  @Autowired
  private RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "fallback")
  public String consumer() {
    return restTemplate.getForObject("http://hello-service/say-hello", String.class);
  }

  public String fallback() {
    return "fallback";
  }

}