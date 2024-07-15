package com.example.spring_boot_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

  @RequestMapping("/")
  public String home() {
    return "\n͜.︵.୨ ✩ ♡ ꕥ Hello World from my special service ꕥ ♡ ✩ ୧.︵.͜\n";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootDockerApplication.class, args);
  }
}
