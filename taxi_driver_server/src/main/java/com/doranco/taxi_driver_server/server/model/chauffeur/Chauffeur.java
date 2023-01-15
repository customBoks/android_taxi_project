package com.doranco.taxi_driver_server.server.model.chauffeur;

import com.doranco.taxi_driver_server.server.model.trajet.Trajet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Chauffeur {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_chauffeur;
    private String prenom;
    private String nom;
    private String numero_bsn;
    private String telephone;
    private String adresse;
    private String pseudo;
    private String password;
    private String email;
    private String position;
    @OneToMany(mappedBy = "chauffeur")
    private List<Trajet> ch_trajets = new ArrayList<>();



}
