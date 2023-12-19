package com.example.poketra.repository;

import com.example.poketra.model.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MatiereRepository extends JpaRepository<Matiere,Integer> {
    @Query("from matiere where id_matiere = ?1")
    public Matiere getMatieresID(Integer idmatiere);
}