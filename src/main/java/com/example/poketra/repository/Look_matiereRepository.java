package com.example.poketra.repository;

import com.example.poketra.model.Look_matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Look_matiereRepository extends JpaRepository <Look_matiere,Integer>{
    @Query("from look_matiere where id_look=?1")
    public List<Look_matiere> getLook_matiereByLook(Integer idLook);
}
