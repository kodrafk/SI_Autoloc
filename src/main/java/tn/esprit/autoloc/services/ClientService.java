package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements ClientInterface {

    ClientRepository clientRepo;

    @Override
    public Client addClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public Client modifyClient(Client c) {
        return clientRepo.save(c);
    }

    @Override
    public List<Client> showClients() {
        return clientRepo.findAll();
    }
}