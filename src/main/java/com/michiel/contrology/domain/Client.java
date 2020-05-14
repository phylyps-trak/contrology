package com.michiel.contrology.domain;

import javax.persistence.*;

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
    private Notities n;

    public Client(){}

    public Client(Persoonsgegevens p, Notities n)
    {
        setNotities(n);
        setPersoonsgegevens(p);
    }
    @Override
    public String toString()
    {
        return "Client { " +
                "id=" + id + p + n +
                '}';
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
