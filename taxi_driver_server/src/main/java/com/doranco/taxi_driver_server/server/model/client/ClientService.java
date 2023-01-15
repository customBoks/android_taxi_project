package com.doranco.taxi_driver_server.server.model.client;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements IClientService{

    //implementation des fonctionalitées en se basant sur le JpaRepo
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) throws Exception {
        //contrainte
        return clientRepository.save(client);
    }

    @Override
    public Client getClient(Integer id_client) throws Exception {
        Optional<Client> clientOptional = clientRepository.findById(id_client);
        if(clientOptional.isPresent()) // si le client est present
            return clientOptional.get(); // on le retourne
        else
            throw new RuntimeException("client non trouvé");// sinon exception message // on utilise optional pour ne pas avoir des erreurs nullpointerexception
    }


    @Override
    public List<Client> getAllClients(Client client) throws Exception {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Client client) throws Exception {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteClient(Integer id_client) throws Exception {
        Client client = getClient(id_client);
        clientRepository.deleteById(id_client);
        return client;
    }
}
