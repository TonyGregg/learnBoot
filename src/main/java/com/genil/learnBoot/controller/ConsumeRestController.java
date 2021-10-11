package com.genil.learnBoot.controller;

import com.genil.learnBoot.pojo.Quote;
import com.genil.learnBoot.pojo.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created on Wed, 5/5/21 at 10:33 AM by Genil.
 */
@RestController
@RequestMapping("/api/consume")
@Slf4j
public class ConsumeRestController {
  @Autowired
  RestTemplate restTemplate;
  @Value("${learn.boot.quoteApiUrl}")
  String quoteURL;

  @GetMapping("/v1/bootQuote")
  public Quote getRandomBootQuote() {
    Quote quote = restTemplate.getForObject(quoteURL, Quote.class);
    log.info("Quote : {} ", quote);
    return quote;
  }
  @GetMapping("v1/request")
  public Request readRequest(@RequestBody Request request) {
    log.debug("Request received {} ", request);
    return request;
  }
}
