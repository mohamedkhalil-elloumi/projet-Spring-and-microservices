package com.ensiairlines.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="Vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_vol")
    private Long id;

    @Column(name = "Depart")
    private String depart;

    @Column(name ="Arrive")
    private String arrive;

    @Column(name="ETD")
    private String ETD ;

    @Column(name="ETA")
    private String ETA ;

    @Column(name="nb_Place_Reserve")
    private int nb_Place_Reserve ;


    @ManyToOne
    @JoinColumn(name="id")
    private Avion avion;


    public Vol() {
    }

    public Vol(String depart, String arrive, String ETD, String ETA, Avion avion) {

        this.depart = depart;
        this.arrive = arrive;
        this.ETD = ETD;
        this.ETA = ETA;
        this.avion = avion;
        this.nb_Place_Reserve= 0;
    }

    public Long getId() {
        return id;
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

    public int getNb_Place_Reserve() {
        return nb_Place_Reserve;
    }

    public void setNb_Place_Reserve(int nb_Place_Reserve) {
        this.nb_Place_Reserve = nb_Place_Reserve;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "id=" + id +
                ", depart='" + depart + '\'' +
                ", arrive='" + arrive + '\'' +
                ", ETD='" + ETD + '\'' +
                ", ETA='" + ETA + '\'' +
                ", nb_Place_Reserve=" + nb_Place_Reserve +
                ", avion=" + avion +
                '}';
    }
}
