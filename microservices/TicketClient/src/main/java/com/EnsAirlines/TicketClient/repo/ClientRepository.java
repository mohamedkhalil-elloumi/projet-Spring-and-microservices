package com.EnsAirlines.TicketClient.repo;

import com.EnsAirlines.TicketClient.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client save(Client client);
}