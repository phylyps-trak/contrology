package com.michiel.contrology.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class Persoonsgegevens
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String voornaam;
    private String achternaam;
    private LocalDate datumIngeschreven;

    public Persoonsgegevens(){}
    public Persoonsgegevens(String v, String a)
    {
       this.voornaam = v;
       this.achternaam = a;
    }
    @Override
    public String toString() {
        return " Persoonsgegevens { id=" +
                id +
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

                //TODO dit slaat nog helemaal nergens op, later netjes maken!!
                @JsonIgnore
    public String setDatumIngeschreven(String datum)
    {
        try {
            this.datumIngeschreven = LocalDate.parse(datum, DateTimeFormatter.ISO_DATE);
        } catch(Exception e) {
            return "Dat is helaas geen geldige invoer";
        }
        return "Dikke prima";
    }
    @JsonIgnore
    public LocalDate getDatumIngeschreven() { return datumIngeschreven; }
}
