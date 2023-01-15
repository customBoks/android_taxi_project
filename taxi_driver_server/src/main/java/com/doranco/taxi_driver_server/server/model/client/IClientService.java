package com.doranco.taxi_driver_server.server.model.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;

import java.util.ArrayList;
import java.util.List;


//declare l'ensemble des methodes de l'application pour plus de clarté


public interface IClientService {

    // une seule methode saveClient pour l'admin et le client que l'ont va
    // gerer avec SpringSecurity car les deux sont des utilisateurs

    public Client createClient(Client client) throws Exception;

    public Client getClient(Integer id_client) throws Exception;


    public List<Client> getAllClients(Client client) throws Exception;

    public Client updateClient(Client client) throws Exception;

    public Client deleteClient(Integer id_client) throws Exception;
}
