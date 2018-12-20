package com.github.xfslove;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrixDashboard
@SpringCloudApplication
@ComponentScan(basePackages = "com.github.xfslove")
public class HystrisDashboardApplication {

  public static void main(String[] args) {
    SpringApplication.run(HystrisDashboardApplication.class, args);
  }
}
