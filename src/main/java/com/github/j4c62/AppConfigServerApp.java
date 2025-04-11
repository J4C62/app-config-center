package com.github.j4c62;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AppConfigServerApp {
  public static void main(String[] args) {
    SpringApplication.run(AppConfigServerApp.class, args);
  }
}