package com.ensiairlines.app.service;

import com.ensiairlines.app.model.Avion;
import com.ensiairlines.app.repo.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvionService {

    @Autowired
    AvionRepository avionRepository;


    public List<Avion> getAllAvions() {
        List<Avion> avions = new ArrayList<>();
        avionRepository.findAll().forEach(avions::add);
        return avions;
    }

    public Avion postAvion(Avion avion) {
        Avion _avion= new Avion();
        _avion = avionRepository.save(avion);
        return _avion;
    }
}
