package com.example.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping
    public String showForm(){
        return "domain-form";
    }
    @PostMapping(value = "submit")
    public String submitForm(){
        return "redirect:/domain";
    }

    @GetMapping(value = "chart")
    public String showChart(){
        return "chart";
    }
}
