package com.EnsAirlines.TicketClient.model;


import javax.persistence.*;


@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ticket")
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Column(name = "id_vol")
    private long id_vol;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "type")
    private String type;


    public Ticket() { }

    public Ticket(Client client, long id_vol, Float prix, String type) {
        this.client = client;
        this.id_vol = id_vol;
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

    public long getVol() {
        return id_vol;
    }

    public void setVol(long id_vol) {
        this.id_vol = id_vol;
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
                ", vol=" + id_vol +
                ", prix=" + prix +
                ", type='" + type + '\'' +
                '}';
    }


}

