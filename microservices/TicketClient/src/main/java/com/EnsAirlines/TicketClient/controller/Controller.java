package com.EnsAirlines.TicketClient.controller;

import com.EnsAirlines.TicketClient.model.Client;
import com.EnsAirlines.TicketClient.model.Ticket;

import com.EnsAirlines.TicketClient.service.ClientService;
import com.EnsAirlines.TicketClient.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ClientService clientService;
    @Autowired
    TicketService ticketService;

    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
    @PostMapping(value = "/client/create")
    public Client postClient(@RequestBody Client client) {
        return clientService.postClient(client);
    }

    @GetMapping("/tickets")
    public List<Ticket> getAllTicket() {
        return ticketService.getAllTicket();
    }
    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.GET)
    public List<Ticket> getClientAllTicket(@PathVariable int id) {
        System.out.println(id);
        return ticketService.getAllTicketByClient(id);
    }
    @PostMapping(value = "/ticket/create")
    public Ticket postTicket(@RequestBody Ticket ticket) {
        return ticketService.postTicket(ticket);
    }



}
