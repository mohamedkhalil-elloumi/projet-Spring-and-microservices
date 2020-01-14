package com.EnsAirlines.Vol.repo;

import com.EnsAirlines.Vol.model.Vol;
import org.springframework.data.repository.CrudRepository;

public interface VolRepository extends CrudRepository<Vol, Long> {
    Vol save(Vol vol);
}