package com.EnsAirlines.TicketClient.repo;

import com.EnsAirlines.TicketClient.model.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    Ticket save(Ticket ticket);
    List<Ticket> findByClientId(long id);
}