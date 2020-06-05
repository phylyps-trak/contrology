package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Notities;
import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService
{
    @Autowired ClientRepo clientRepo;
    @Autowired NotitiesRepo notitiesRepo;
    @Autowired PersoonsgegevensRepo persoonsgegevensRepo;
// ALLES VOOR CLIENTS
    /**
     *      Bekijk alle clienten methode
     */
    public Iterable<Client> findClients()
    {
        return clientRepo.findAll();
    }
    /**
     *      Vind 1 Client via z'n ID
     * @param   clientid to find
     * @return  the Client whose ID you gave
     */
    public Client findClientById(long clientid) { return clientRepo.findById(clientid).get(); }
    /**
     *      Save Client to Database
     * @param c - the client object to save
     */
    public Client saveClient(Client c)
    {
        clientRepo.save(c);
        System.out.println("-->> client opgeslagen in database");
        return c;
    }
    /**
     *      verwijder Client uit database by ID
     * @param clientId
     */
    public void deleteClient(Long clientId)
    {
        clientRepo.deleteById(clientId);
        System.out.printf("-->> Client met id" + clientId + "verwijderd");
    }
//ALLES VOOR NOTES & PGEGEVENS
    /**
     *      Save Notes to Database
     * @param n - the notities object to  save
     */
    public Notities saveNotities(Notities n)
    {
        notitiesRepo.save(n);
        System.out.println("-->> notities opgeslagen in database");
        return n;
    }
    /**
     *      Save Persoonsgegevens to Database
     * @param p - Persoonsgegevens object
     */
    public Persoonsgegevens savePersoonsgegevens(Persoonsgegevens p)
    {
        persoonsgegevensRepo.save(p);
        System.out.println("-->> Persoonsgegevens opgeslagen in database");
        return p;
    }
}
