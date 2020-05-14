package com.michiel.contrology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persoonsgegevens
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Persoonsgegevens(String v, String a)
    {
       this.voornaam = v;
       this.achternaam = a;
    }

    @Override
    public String toString() {
        return " Persoonsgegevens { " +
                voornaam + " " + achternaam +
                '}';
    }

    String voornaam;
    String achternaam;
}
