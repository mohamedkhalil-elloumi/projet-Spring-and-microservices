package com.EnsAirlines.Avion.service;


import com.EnsAirlines.Avion.model.Avion;
import com.EnsAirlines.Avion.repo.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Avion findAvionById(long id) {
        Optional<Avion> _avion = avionRepository.findById(id);
        Avion avion = new Avion();
        if(_avion.isPresent())
            avion = _avion.get();
        return avion;
    }

    public int getNbrPlace(long id) {
        Avion avion = findAvionById(id);
        return avion.getNb_places();
    }
}
