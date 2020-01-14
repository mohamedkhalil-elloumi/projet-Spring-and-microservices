package com.EnsAirlines.Vol.model;

import javax.persistence.*;


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


    @Column(name="id_avion")
    private long id_avion;


    public Vol() {
    }

    public Vol(String depart, String arrive, String ETD, String ETA, long avion) {

        this.depart = depart;
        this.arrive = arrive;
        this.ETD = ETD;
        this.ETA = ETA;
        this.id_avion = id_avion;
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

    public long getAvion() {
        return id_avion;
    }

    public void setAvion(long id_avion) {
        this.id_avion = id_avion;
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
                ", avion=" + id_avion +
                '}';
    }
}
