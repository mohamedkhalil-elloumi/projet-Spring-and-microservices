package com.ensiairlines.app.repo;

import com.ensiairlines.app.model.Ticket;
import com.ensiairlines.app.model.Vol;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    Ticket save(Ticket ticket);
    List<Ticket> findByClientId(long id);
}