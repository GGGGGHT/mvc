package com.example.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCon {
  @GetMapping("/get")
  public String te(){
    return "get";
  }
}
