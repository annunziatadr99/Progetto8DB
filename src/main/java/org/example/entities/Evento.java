package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {

    @Id // qui specifichiamo chi e la nostra Primary key
    @GeneratedValue //uguale al SERIAL in Database
    private Long id;

    @Column(name = "Name",nullable = false)  //nullable = false uguale a NOT NULL
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column
    private int age;

    @Column(length = 25)  //uguale a VARCHAR(25)
    private String city;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    public User() {} // questo costruttore è ESSENZIALE perchè servirà al DB CREARE SEMPRE!!!!

    public User(String firstname, String lastname, int age, String city, String email, String password){
        this.firstname = firstname;
        this.lastname=lastname;
        this.age=age;
        this.city=city;
        this.email=email;
        this.password=password;
    }

}
