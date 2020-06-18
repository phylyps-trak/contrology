package com.michiel.contrology.domain;

import javax.persistence.*;
import java.util.ArrayList;
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
    //TODO
    //@ManyToOne
    //private Docent d;

    //  ===         DE LIJST MET NOTITIES
    @OneToMany
    @JoinColumn(name = "client_id")
    private List<Notitie> notitieLijst = new ArrayList<>();

    public void addNotitie(Notitie n)
    {
        notitieLijst.add(n);
    }
    //          CONSTRUCTORS
    public Client(){}
    public Client(Persoonsgegevens p)
    {
        setP(p);
    }
    public Client(Persoonsgegevens p, Notitie n)
    {
        setP(p);
        addNotitie(n);
    }
    @Override
    public String toString()
    {
        return "Client { " +
                "id=" + id + p + notitieLijst +
                '}';
    }
    public Persoonsgegevens getP() { return p; }
    public void setP(Persoonsgegevens p) { this.p = p; }
    public List<Notitie> getNotitieLijst() { return notitieLijst; }
    public void setNotitieLijst(List<Notitie> notitieLijst) { this.notitieLijst = notitieLijst; }
    public long getId() { return id; }

}
