package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
  
  public String start(){
    return "Ciao!";
  }

  @GetMapping("/info")
  public String info(){
    return "Informazioni!";
  }

}
