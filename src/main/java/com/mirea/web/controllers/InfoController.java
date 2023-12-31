package com.mirea.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    @GetMapping("/info")
    public String info(Model model){
        model.addAttribute("title", "Главная страница");
        return "info";
    }
}
