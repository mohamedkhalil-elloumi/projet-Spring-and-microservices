package com.ensiairlines.app.model;

import javax.persistence.*;

@Entity
@Table(name = "Avions")

public class Avion {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "type")
    private String type;

    @Column(name = "nb_places")
    private int nb_places;

    @Column(name = "status")
    private boolean status;

    public Avion() {
    }

    public Avion(long id, String type, int nb_places, boolean status) {
        id = id;
        this.type = type;
        this.nb_places = nb_places;
        this.status = status;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getNb_places() {
        return nb_places;
    }

    public void setNb_places(int nb_places) {
        this.nb_places = nb_places;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", nb_places=" + nb_places +
                ", status=" + status +
                '}';
    }
}
