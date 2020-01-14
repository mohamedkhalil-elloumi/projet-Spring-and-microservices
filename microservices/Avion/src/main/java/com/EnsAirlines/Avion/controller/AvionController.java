package com.EnsAirlines.Avion.controller;

import com.EnsAirlines.Avion.model.Avion;
import com.EnsAirlines.Avion.service.AvionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class AvionController {


    @Autowired
    AvionService avionService;


    @GetMapping("/avions")
    public List<Avion> getAllAvions() {
        return avionService.getAllAvions();
    }
    @PostMapping(value = "/avion/create")
    public Avion postAvion(@RequestBody Avion avion) {
        return avionService.postAvion(avion);
    }
    @GetMapping(value = "nbrPlace/{id}")
    public int getNbrPlace(@PathVariable long id) {
        return avionService.getNbrPlace(id);
    }


}
