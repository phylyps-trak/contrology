package com.michiel.contrology.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Notitie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate datum;
    private String notes;

    public Notitie() { }

    public Notitie(String notes) {
        this.notes = notes;
    }
    public Notitie(String datum, String notes)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.datum = LocalDate.parse(datum, formatter);
        this.notes = notes;
    }
    @Override
    public String toString() {
        return " Notities { " + datum +
                notes +
                '}';
    }
    public void setId(long id) { this.id = id; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
}
