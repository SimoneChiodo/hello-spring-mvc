package org.lessons.java.hello_spring_mvc.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController {
  @GetMapping("/info")
  public String info(){
    return "info";
  }

  @GetMapping("/details/{id}")
  public String productDetails(@PathVariable("id") String id, Model model) {
      model.addAttribute("productId", id);
      model.addAttribute("date", LocalDateTime.now());

      return "details";
  }
  

}
