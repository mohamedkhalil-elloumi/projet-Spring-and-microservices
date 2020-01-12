package com.ensiairlines.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.ensiairlines.app.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client save(Client client);
}