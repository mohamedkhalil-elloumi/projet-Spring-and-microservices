package com.ensiairlines.app.controller;

import com.ensiairlines.app.model.Avion;
import com.ensiairlines.app.model.Client;
import com.ensiairlines.app.model.Ticket;
import com.ensiairlines.app.model.Vol;


import com.ensiairlines.app.service.AvionService;
import com.ensiairlines.app.service.ClientService;
import com.ensiairlines.app.service.TicketService;
import com.ensiairlines.app.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ClientService clientService;
    @Autowired
    AvionService avionService;
    @Autowired
    VolService volService;
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

    @GetMapping("/avions")
    public List<Avion> getAllAvions() {
        return avionService.getAllAvions();
    }
    @PostMapping(value = "/avion/create")
    public Avion postAvion(@RequestBody Avion avion) {
        return avionService.postAvion(avion);
    }


    @GetMapping("/vols")
    public List<Vol> getAllVol() {
        return volService.getAllVol();
    }
    @GetMapping(value = "vols/{id}")
    public Vol findVolById(@PathVariable long id) {
        return volService.findVolById(id);
    }
    @PostMapping(value = "/vol/create")
    public Vol postVol(@RequestBody Vol vol) {
        return volService.postVol(vol);
    }


    @GetMapping("/tickets")
    public List<Ticket> getAllTicket() {
        return ticketService.getAllTicket();
    }
    @PostMapping(value = "/ticket/create")
    public Ticket postTicket(@RequestBody Ticket ticket) {
        return ticketService.postTicket(ticket);
    }



}
