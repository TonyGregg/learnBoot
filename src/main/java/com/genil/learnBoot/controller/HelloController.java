package com.genil.learnBoot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on Mon, 10/11/21 at 8:05 AM by Genil.
 */
@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("/v1/{name}")
  public String sayHello(@PathVariable(name = "name")String name) {
    log.info("Request received {} ", name);
    return "Hello " + name;
  }

}
