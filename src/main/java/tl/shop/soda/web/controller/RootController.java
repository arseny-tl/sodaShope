package tl.shop.soda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

  @GetMapping(value = "/")
  public String root() {
    return "home";
  }
}
