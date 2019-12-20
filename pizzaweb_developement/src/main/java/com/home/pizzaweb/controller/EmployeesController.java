package com.home.pizzaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tab05_employees")
public class EmployeesController {


  @GetMapping
  public String showDesignForm() {
    return "tab05_employees";
  }

}
