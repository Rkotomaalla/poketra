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

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/look")
public class LookController {
    @Autowired
    LookRepository lookRepository;
    @Autowired
    Look_matiereRepository lookMatiereRepository;
    @Autowired
    MatiereRepository matiereRepository;

    @GetMapping("/pageinsert")
    public String pageinsert(Model model) {

        return "look_insert";
    }

    @PostMapping("/insert")
    public String insert(Model model, @RequestParam("nom")String nom) {
        Look look = new Look();
        look.setNom(nom);
        lookRepository.save(look);

        return "look_insert";
    }

    @GetMapping("/get")
    public String getall(Model model) {
        List<Look> list = lookRepository.findAll();

        model.addAttribute("listlook",list);

        return "list_look";
    }

    @GetMapping("/getmatiere")
    public String getMatiere(Model model,@RequestParam("look")Integer idlook) {
        List<Look_matiere> lookMatieres = lookMatiereRepository.getLook_matiereByLook(idlook);
        List<Matiere> listmatiere = new ArrayList<Matiere>();
        for (Look_matiere lm : lookMatieres) {
            System.out.println("yrdy");
            Matiere m = matiereRepository.getMatieresID(lm.getId_matiere());
            listmatiere.add(m);
        }

        model.addAttribute("listematiere",listmatiere);

        return "list_matiere";
    }
}
