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
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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


    @GetMapping(value = "vols/{id}")
    public Vol findVolById(@PathVariable long id) {

        Optional<Vol> _vol = volRepository.findById(id);
        Vol vol = new Vol();
        if(_vol.isPresent())
           vol = _vol.get();
        return vol;
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
        Vol vol = findVolById(ticket.getVol().getId());
        System.out.println(vol);
        if(vol.getNb_Place_Reserve() < vol.getAvion().getNb_places())
            vol.setNb_Place_Reserve(vol.getNb_Place_Reserve() + 1);
        else
            return _ticket;

        _ticket = ticketRepository.save(ticket);

        return _ticket;
    }



}
