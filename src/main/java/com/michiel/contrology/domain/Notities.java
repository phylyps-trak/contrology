package com.michiel.contrology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Notities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate datum;
    private String notes;


    public Notities() { }

    public Notities(String notes) {
        this.notes = notes;
    }
    public Notities(String datum, String notes)
    {
        this.datum = LocalDate.parse(datum);
        this.notes = notes;
    }

    @Override
    public String toString() {
        return " Notities { " +
                notes +
                '}';
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public LocalDate getDatum() {
        return datum;
    }
    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
