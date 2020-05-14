package com.michiel.contrology.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Persoonsgegevens p;
    private Notities n;

    public Client(Persoonsgegevens p, Notities n)
    {
        setNotities(n);
        setPersoonsgegevens(p);
    }

    public Persoonsgegevens getP() { return p; }
    public void setPersoonsgegevens( Persoonsgegevens p )
    {
        this.p = p;
    }
    public Notities getN() { return n; }
    public void setNotities(Notities n )
    {
        this.n = n;
    }
    public long getId() { return id; }


}
