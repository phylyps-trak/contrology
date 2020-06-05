package com.michiel.contrology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notities
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String notes;

    public Notities(){}

    public Notities(String notes)
    {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return " Notities { " +
                notes +
                '}';
    }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
