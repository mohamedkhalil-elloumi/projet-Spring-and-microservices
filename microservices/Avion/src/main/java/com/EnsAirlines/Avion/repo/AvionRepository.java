package com.EnsAirlines.Avion.repo;

import com.EnsAirlines.Avion.model.Avion;
import org.springframework.data.repository.CrudRepository;

public interface AvionRepository extends CrudRepository<Avion, Long> {
    Avion save(Avion avion);
}