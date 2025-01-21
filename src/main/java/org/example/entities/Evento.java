package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Evento {

    @Id // qui specifichiamo chi e la nostra Primary key
    @GeneratedValue //uguale al SERIAL in Database
    private Long id;

    @Column(name = "Titolo",nullable = false)  //nullable = false uguale a NOT NULL
    private String titolo;

    @Column(name = "Descrizione", nullable = false)
    private String descrizione;

    @Column(name = "Data Evento")
    private int dataEvento;

    @Column(name = "PUBBLICO/PRIVATO", length = 25)  //uguale a VARCHAR(25)
    private String tipoEvento;

    @Column(name = "Numero Massimo Partecipanti", unique = true)
    private int numeroMassimoPartecipanti;


    public Evento() {} // questo costruttore è ESSENZIALE perchè servirà al DB CREARE SEMPRE

    public Evento(String titolo, String descrizione, int dataEvento, String tipoEvento, int numeroMassimoPartecipanti){
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.dataEvento = dataEvento;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;

    }

}
