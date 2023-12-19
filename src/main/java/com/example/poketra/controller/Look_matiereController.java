package com.example.poketra.controller;

import com.example.poketra.model.Look;
import com.example.poketra.model.Look_matiere;
import com.example.poketra.model.Matiere;
import com.example.poketra.repository.LookRepository;
import com.example.poketra.repository.Look_matiereRepository;
import com.example.poketra.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/look_matiere")
public class Look_matiereController {
    @Autowired
    LookRepository lookRepository;
    @Autowired
    MatiereRepository matiereRepository;
    @Autowired
    Look_matiereRepository lookMatiereRepository;
    @GetMapping("/page")
    public String pageinsert(Model model) {
        List<Look> look = lookRepository.findAll();
        List<Matiere> matiere = matiereRepository.findAll();

        model.addAttribute("look",look);
        model.addAttribute("matiere",matiere);


        return "look_matiere_insert";
    }

    @PostMapping("/insert")
    public String insert(Model model, @RequestParam("look")Integer look,@RequestParam("matiere")Integer maitire) {
        Look_matiere lookMatiere = new Look_matiere();
        lookMatiere.setId_matiere(maitire);
        lookMatiere.setId_look(look);

        lookMatiereRepository.save(lookMatiere);

        return "redirect:/look_matiere/page";
    }
}
