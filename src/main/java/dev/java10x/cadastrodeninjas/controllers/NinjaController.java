package dev.java10x.cadastrodeninjas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

  @GetMapping("/welcome")
  public String welcome() {
    return "This is my first message at this route";
  }
}
