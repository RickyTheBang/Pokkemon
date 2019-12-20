package com.home.pizzaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tab06_accounting")
public class AccountingController {


  @GetMapping
  public String showDesignForm() {
    return "tab06_accounting";
  }

}
