package com.doranco.taxi_driver_server.server.model.trajet;


import com.doranco.taxi_driver_server.server.model.admin.Admin;
import com.doranco.taxi_driver_server.server.model.chauffeur.Chauffeur;
import com.doranco.taxi_driver_server.server.model.client.Client;
import com.doranco.taxi_driver_server.server.model.note.Note;
import com.doranco.taxi_driver_server.server.model.paiement.Paiement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Trajet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_trajet;
    private String lieu_arrivee;
    private String lieu_depart;
    private String gps_depart;
    private String gps_arrivee;
    private Boolean annulation;
    @ManyToOne @JoinColumn(name="client_id")
    private Client client;
    @ManyToOne @JoinColumn(name="chauffeur_id")
    private Chauffeur chauffeur;
    @ManyToOne @JoinColumn(name = "admin_id")
    private Admin admin;
    @ManyToOne @JoinColumn(name = "paiement_id")
    private Paiement paiement;
    @ManyToOne @JoinColumn(name = "note_id")
    private Note note;

}
