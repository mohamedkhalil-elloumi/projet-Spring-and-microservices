package com.ensiairlines.app.service;

import com.ensiairlines.app.model.Client;
import com.ensiairlines.app.model.Ticket;
import com.ensiairlines.app.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;
    }

    public Client postClient(Client client) {
        Client _client= new Client();
        _client = clientRepository.save(client);
        return _client;
    }
}
