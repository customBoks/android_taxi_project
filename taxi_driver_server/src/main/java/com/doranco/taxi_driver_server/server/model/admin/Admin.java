package com.doranco.taxi_driver_server.server.model.admin;

import com.doranco.taxi_driver_server.server.model.trajet.Trajet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Admin {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;
    private String pseudo;
    private String password;
    private String email;
    @OneToMany(mappedBy = "admin")
    private List<Trajet> ad_trajets = new ArrayList<>();

}
