package com.michiel.contrology.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String testName;

    @OneToOne
    private Persoonsgegevens p;

    @OneToOne
    private List<Notities> notitiesLijst;
    public void addNotitie(String datum, String notitie) {
        Notities n = new Notities(datum, notitie);
        notitiesLijst.add(n);
    }
    public Client(){}
    public Client(Persoonsgegevens p)
    {
        setPersoonsgegevens(p);
    }
    public Client(Persoonsgegevens p, Notities n)
    {
        setNotities(notitiesLijst);
        setPersoonsgegevens(p);
    }
    @Override
    public String toString()
    {
        return "Client { " +
                "id=" + id + p + notitiesLijst +
                '}';
    }
    public Persoonsgegevens getP() { return p; }
    public void setPersoonsgegevens( Persoonsgegevens p )
    {
        this.p = p;
    }
    public List<Notities> getN() { return notitiesLijst; }
    public void setNotities(List<Notities> n )
    {
        this.notitiesLijst = n;
    }

public long getId() { return id; }

}
