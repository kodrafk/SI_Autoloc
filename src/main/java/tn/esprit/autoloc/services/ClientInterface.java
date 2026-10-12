package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Client;
import java.util.List;

public interface ClientInterface {

    public Client addClient(Client c);

    public void deleteClient(Long id);

    public Client modifyClient(Client c);

    public List<Client> showClients();
}
