package com.ensiairlines.app.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Vol")
public class Vol {

    @Id
    @GeneratedValue
    private int id ;

    @JoinColumn(name = "Depart")
    private String depart;

    @JoinColumn(name ="Arrivé")
    private String arrive;

    @JoinColumn(name="ETD")
    private Date ETD ;

    @JoinColumn(name="ETA")
    private Date ETA ;

    @JoinColumn(name="nb_Place_Dispo")
    private int nb_Place_Dispo ;

    @JoinColumn(name="Tickets")
    private List<Ticket> liste;

    @JoinColumn(name="Avion")
    private Avion avion;

    public Vol(String depart, String arrive, Date ETD, Date ETA, Avion avion) {
        this.depart = depart;
        this.arrive = arrive;
        this.ETD = ETD;
        this.ETA = ETA;
        this.avion = avion;
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

    public Date getETD() {
        return ETD;
    }

    public void setETD(Date ETD) {
        this.ETD = ETD;
    }

    public Date getETA() {
        return ETA;
    }

    public void setETA(Date ETA) {
        this.ETA = ETA;
    }

    public int getNb_Place_Dispo() {
        return nb_Place_Dispo;
    }

    public void setNb_Place_Dispo(int nb_Place_Dispo) {
        this.nb_Place_Dispo = nb_Place_Dispo;
    }

    public List<Ticket> getListe() {
        return liste;
    }

    public void setListe(List<Ticket> liste) {
        this.liste = liste;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }


}
