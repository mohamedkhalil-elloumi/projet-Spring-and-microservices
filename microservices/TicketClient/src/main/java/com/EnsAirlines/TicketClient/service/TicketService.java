package com.EnsAirlines.TicketClient.service;

import com.EnsAirlines.TicketClient.model.Ticket;
import com.EnsAirlines.TicketClient.repo.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    TicketRepository ticketRepository;

    RestTemplate restTemplate = new RestTemplate();

    public List<Ticket> getAllTicket() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);
        return tickets;
    }


    public Ticket postTicket(Ticket ticket) {
        Ticket _ticket= new Ticket();

        String avion_full = restTemplate.getForObject("http://localhost:9001/api/full/"+ticket.getVol(),String.class);

        if(avion_full != "full")
            _ticket = ticketRepository.save(ticket);

        return _ticket;
    }

    public List<Ticket> getAllTicketByClient(int id) {
        return ticketRepository.findByClientId(id);
    }
}
