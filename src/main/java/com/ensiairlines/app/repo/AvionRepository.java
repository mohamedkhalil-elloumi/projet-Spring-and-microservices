package com.ensiairlines.app.repo;

import com.ensiairlines.app.model.Avion;
import org.springframework.data.repository.CrudRepository;

public interface AvionRepository extends CrudRepository<Avion, Long> {
    Avion save(Avion client);
}