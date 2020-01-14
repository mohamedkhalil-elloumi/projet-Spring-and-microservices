package com.ensiairlines.app.service;

import com.ensiairlines.app.model.Ticket;
import com.ensiairlines.app.model.Vol;
import com.ensiairlines.app.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    VolService volService;


    public List<Ticket> getAllTicket() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);
        return tickets;
    }


    public Ticket postTicket(Ticket ticket) {
        Ticket _ticket= new Ticket();
        Vol vol = volService.findVolById(ticket.getVol().getId());

        if(vol.getNb_Place_Reserve() < vol.getAvion().getNb_places())
            vol.setNb_Place_Reserve(vol.getNb_Place_Reserve() + 1);
        else
            return _ticket;

        _ticket = ticketRepository.save(ticket);

        return _ticket;
    }

    public List<Ticket> getAllTicketByClient(int id) {
        return ticketRepository.findByClientId(id);
    }
}
