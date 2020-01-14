package com.ensiairlines.app.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Ticket")
public class Ticket{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ticket")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "id_vol")
    private Vol vol;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "type")
    private String type;


    public Ticket() { }

    public Ticket(Client client, Vol vol, Float prix, String type) {
        this.client = client;
        this.vol = vol;
        this.prix = prix;
        this.type = type;
    }

    public long getId() {
        return id;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", client=" + client +
                ", vol=" + vol +
                ", prix=" + prix +
                ", type='" + type + '\'' +
                '}';
    }


}

