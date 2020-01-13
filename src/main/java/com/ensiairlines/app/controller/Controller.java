package com.ensiairlines.app.controller;

import com.ensiairlines.app.model.Avion;
import com.ensiairlines.app.model.Client;
import com.ensiairlines.app.model.Ticket;
import com.ensiairlines.app.model.Vol;
import com.ensiairlines.app.repo.ClientRepository;
import com.ensiairlines.app.repo.AvionRepository;
import com.ensiairlines.app.repo.VolRepository;
import com.ensiairlines.app.repo.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    AvionRepository avionRepository;
    @Autowired
    VolRepository volRepository;
    @Autowired
    TicketRepository ticketRepository;


    @GetMapping("/clients")
    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);

        return clients;
    }

    @PostMapping(value = "/client/create")
    public Client postClient(@RequestBody Client client) {

        Client _client= new Client();
        _client = clientRepository.save(client);
        return _client;
    }

    @GetMapping("/avions")
    public List<Avion> getAllAvions() {
        List<Avion> avions = new ArrayList<>();
        avionRepository.findAll().forEach(avions::add);

        return avions;
    }

    @PostMapping(value = "/avion/create")
    public Avion postAvion(@RequestBody Avion avion) {

        Avion _avion= new Avion();
        _avion = avionRepository.save(avion);
        return _avion;
    }

    @GetMapping("/vols")
    public List<Vol> getAllVol() {
        List<Vol> vols = new ArrayList<>();
        volRepository.findAll().forEach(vols::add);

        return vols;
    }

    @PostMapping(value = "/vol/create")
    public Vol postVol(@RequestBody Vol vol) {

        Vol _vol= new Vol();
        _vol = volRepository.save(vol);
        return _vol;
    }

    @GetMapping("/tickets")
    public List<Ticket> getAllTicket() {
        List<Ticket> tickets = new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);

        return tickets;
    }

    @PostMapping(value = "/ticket/create")
    public Ticket postTicket(@RequestBody Ticket ticket) {

        Ticket _ticket= new Ticket();
        _ticket = ticketRepository.save(ticket);
        return _ticket;
    }

}
