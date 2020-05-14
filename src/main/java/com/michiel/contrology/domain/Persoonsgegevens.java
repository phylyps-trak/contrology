package com.michiel.contrology.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    private String voornaam;
    private String achternaam;

    public Persoonsgegevens(){}
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
    @JsonIgnore
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getAchternaam() { return achternaam; }
    public void setAchternaam(String achternaam) { this.achternaam = achternaam; }
    public String getVoornaam() { return voornaam; }
    public void setVoornaam(String voornaam) { this.voornaam = voornaam; }
}
