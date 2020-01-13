package com.ensiairlines.app.repo;

import com.ensiairlines.app.model.Vol;
import org.springframework.data.repository.CrudRepository;

public interface VolRepository extends CrudRepository<Vol, Long> {
    Vol save(Vol vol);
}