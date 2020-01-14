package com.EnsAirlines.Vol.controller;


import com.EnsAirlines.Vol.model.Vol;
import com.EnsAirlines.Vol.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    VolService volService;



    @GetMapping("/vols")
    public List<Vol> getAllVol() {
        return volService.getAllVol();
    }
    @GetMapping(value = "vols/{id}")
    public Vol findVolById(@PathVariable long id) {
        return volService.findVolById(id);
    }
    @PostMapping(value = "/vol/create")
    public Vol postVol(@RequestBody Vol vol) {
        return volService.postVol(vol);
    }
    @GetMapping(value = "full/{id}")
    public String isFullById(@PathVariable long id) {
        return volService.isFullById(id);
    }





}
