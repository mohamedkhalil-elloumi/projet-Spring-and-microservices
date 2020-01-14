package com.EnsAirlines.Vol.service;

import com.EnsAirlines.Vol.model.Vol;
import com.EnsAirlines.Vol.repo.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class VolService {
    @Autowired
    VolRepository volRepository;

    RestTemplate restTemplate = new RestTemplate();

    public List<Vol> getAllVol() {
        List<Vol> vols = new ArrayList<>();
        volRepository.findAll().forEach(vols::add);

        return vols;
    }

    public Vol findVolById(long id) {
        Optional<Vol> _vol = volRepository.findById(id);
        Vol vol = new Vol();
        if(_vol.isPresent())
            vol = _vol.get();
        return vol;
    }

    public Vol postVol(Vol vol) {

        Vol _vol= new Vol();
        _vol = volRepository.save(vol);
        return _vol;
    }

    public String isFullById(long id) {
        Vol vol = findVolById(id);
        int nbr_places_avion = restTemplate.getForObject("http://localhost:9000/api/nbrPlace/"+vol.getAvion(),int.class);

        if(vol.getNb_Place_Reserve() < nbr_places_avion)
        {
            vol.setNb_Place_Reserve(vol.getNb_Place_Reserve() + 1);
            return "Not_full";
        }
        return "full";
    }
}
