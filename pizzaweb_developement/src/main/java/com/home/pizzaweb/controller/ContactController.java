package com.home.pizzaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tab04_contact")
public class ContactController {

  @GetMapping
  public String showDesignForm() {
    return "tab04_contact";     //
  }





}
