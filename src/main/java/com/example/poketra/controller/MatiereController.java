package com.example.poketra.controller;

import com.example.poketra.model.Matiere;
import com.example.poketra.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/matiere")
public class MatiereController {
    @Autowired
    MatiereRepository matiereRepository;

    @GetMapping("/pageinsert")
    public String insertMatiere(Model model) {

        return "matiere_insert";
    }

    @PostMapping("/insert")
    public String insert(Model model, @RequestParam("nom")String nom,@RequestParam("luxure") Integer luxure) {
        Matiere m = new Matiere();
        m.setNom(nom);
        m.setLuxure(luxure);
        matiereRepository.save(m);

        return "matiere_insert";
    }
}
