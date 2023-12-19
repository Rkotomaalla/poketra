package com.example.poketra.Service;

import com.example.poketra.repository.MatiereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereService {
    @Autowired
    MatiereRepository matiereRepository;


}
