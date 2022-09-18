package com.trap2.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trap2.shop.services.DepartementService;

@Controller
@RequestMapping("/api/shop-service/")
public class Index
{
  public Index(DepartementService service)
  {
    this.service = service;
  }

  private final DepartementService service;

  @GetMapping("home")
  public  String index(Model model){
    model.addAttribute("departements", service.getAll());
    return "ajouter-boutique";
  }
}
