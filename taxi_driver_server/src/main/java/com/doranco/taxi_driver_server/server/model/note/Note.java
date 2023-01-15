package com.doranco.taxi_driver_server.server.model.note;

import com.doranco.taxi_driver_server.server.model.trajet.Trajet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Note {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_note;
    private Integer note;
    @OneToMany(mappedBy = "note")
    private List<Trajet> nt_trajets = new ArrayList<>();


}
