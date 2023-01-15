package com.doranco.taxi_driver_server.server.model.client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    //Client getById();
}
