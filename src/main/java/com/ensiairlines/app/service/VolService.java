package com.ensiairlines.app.service;

import com.ensiairlines.app.model.Vol;
import com.ensiairlines.app.repo.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class VolService {
    @Autowired
    VolRepository volRepository;


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
}
