package com.ensiairlines.app.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import com.ensiairlines.app.model.Avion;

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
    private Date ETD ;

    @Column(name="ETA")
    private Date ETA ;

    @Column(name="nb_Place_Dispo")
    private int nb_Place_Dispo ;

    @OneToMany
    @JoinColumn(name="id_ticket")
    private List<Ticket> tickets;

    @OneToOne
    @JoinColumn(name="id_avion")
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
