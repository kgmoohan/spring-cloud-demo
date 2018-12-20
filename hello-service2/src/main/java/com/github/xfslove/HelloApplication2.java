package com.github.xfslove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.github.xfslove")
public class HelloApplication2 {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication2.class, args);
  }
}
