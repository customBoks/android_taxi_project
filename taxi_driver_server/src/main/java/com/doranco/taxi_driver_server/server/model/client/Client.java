package com.doranco.taxi_driver_server.server.model.client;


import com.doranco.taxi_driver_server.server.model.trajet.Trajet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private String pseudo;
    private String password;
    private String email;
    private String telephone;
    private String position;
    @OneToMany(mappedBy = "client")
    private List<Trajet> cl_trajets = new ArrayList<>() ;



}
