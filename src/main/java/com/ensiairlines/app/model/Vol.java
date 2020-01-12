package com.ensiairlines.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ensiairlines.app.repo.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_vol")
    private int id;

    @Column(name = "Depart")
    private String depart;

    @Column(name ="Arrive")
    private String arrive;

    @Column(name="ETD")
    private String ETD ;

    @Column(name="ETA")
    private String ETA ;

    @Column(name="nb_Place_Dispo")
    private int nb_Place_Dispo ;

    @OneToMany
    @JoinColumn(name="id_ticket")
    private List<Ticket> tickets;

    @ManyToOne
    @JoinColumn(name="id_avion")
    private Avion avion;


    public Vol() {
    }

    public Vol(String depart, String arrive, String ETD, String ETA, Avion avion) {

        this.depart = depart;
        this.arrive = arrive;
        this.ETD = ETD;
        this.ETA = ETA;
        this.avion = avion;
        this.nb_Place_Dispo= this.avion.getNb_places();
        this.tickets = new ArrayList<Ticket>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getETD() {
        return ETD;
    }

    public void setETD(String ETD) {
        this.ETD = ETD;
    }

    public String getETA() {
        return ETA;
    }

    public void setETA(String ETA) {
        this.ETA = ETA;
    }

    public int getNb_Place_Dispo() {
        return nb_Place_Dispo;
    }

    public void setNb_Place_Dispo(int nb_Place_Dispo) {
        this.nb_Place_Dispo = nb_Place_Dispo;
    }

    public List<Ticket> getListe() {
        return this.tickets;
    }

    public void setListe(List<Ticket> liste) {
        this.tickets = tickets;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }


}
