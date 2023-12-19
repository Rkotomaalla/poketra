package com.example.poketra.model;

import jakarta.persistence.*;

@Entity(name = "look")
public class Look {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_look;
    @Column(name = "nom")
    String nom;

    public Look() {
    }

    public Integer getId_look() {
        return id_look;
    }

    public void setId_look(Integer id_look) {
        this.id_look = id_look;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
