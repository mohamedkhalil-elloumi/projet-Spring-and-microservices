package com.ensiairlines.app.controller;

import com.ensiairlines.app.model.Client;
import com.ensiairlines.app.repo.ClientRepository;
import org.apache.catalina.Cluster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client> getAllAbsences() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);

        return clients;
    }

    @PostMapping(value = "/client/create")
    public Client postAbsence(@RequestBody Client client) {

        Client _client= new Client();
        _client = clientRepository.save(client);
        return _client;
    }

}
