package org.generation.jaita138.demo5.db.service;

import java.util.List;

import org.generation.jaita138.demo5.db.entity.Animale;
import org.generation.jaita138.demo5.db.repo.AnimaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimaleService {

    @Autowired
    private AnimaleRepo animaleRepo;

    public void insertAnimale(Animale animale) {

        animaleRepo.save(animale);
    }

    public List<Animale> findAll() {

        return animaleRepo.findAll();
    }

}
