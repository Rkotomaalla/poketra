package com.example.poketra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/acceuil")
    public String acceuil(Model model) {

        return "exemple_acceuil";
    }

    @GetMapping("/formulaire")
    public String header(Model model) {
        return "exemple_formulaire";
    }

    @GetMapping("/table")
    public String table(Model model) {
        return "exemple_tableau";
    }
}
