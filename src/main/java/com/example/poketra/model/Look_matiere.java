package com.example.poketra.model;
import jakarta.persistence.*;
@Entity(name = "look_matiere")
public class Look_matiere {
    public Look_matiere() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_look_matiere;
    @Column(name = "id_matiere")
    Integer id_matiere;
    @Column(name = "id_look")
    Integer id_look;
    public Look_matiere(Integer id_matiere, Integer id_look) {
        this.id_matiere = id_matiere;
        this.id_look = id_look;
    }
    public Integer getId_look_matiere() {
        return id_look_matiere;
    }
    public void setId_look_matiere(Integer id_look_matiere) {
        this.id_look_matiere = id_look_matiere;
    }
    public Integer getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(Integer id_matiere) {
        this.id_matiere = id_matiere;
    }

    public Integer getId_look() {
        return id_look;
    }

    public void setId_look(Integer id_look) {
        this.id_look = id_look;
    }
}
