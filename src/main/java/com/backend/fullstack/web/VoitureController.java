package com.backend.fullstack.web;

import com.backend.fullstack.modele.Voiture;
import com.backend.fullstack.modele.VoitureRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
@AllArgsConstructor
public class VoitureController {

    private final VoitureRepo voitureRepo;
    @RequestMapping("/voitures")
    public Iterable<Voiture> getVoitures(){
        return voitureRepo.findAll();
    }
}
