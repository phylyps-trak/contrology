package com.michiel.contrology.api;

import com.michiel.contrology.controller.ClientService;
import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Notitie;
import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoEndpoints
{
    @Autowired
    ClientService clientService;

    //TODO laat autogenerate data voor database ergens anders gebeuren
    /**
     *      maak dummy mensen aan met dit endpoint (gebruikt onderstaande methode)
     */
    @GetMapping("/dummy")
    public String generateDummyClients()
    {
        for( int i = 0; i<voornamen.length; i++ )
        {
            clientService.saveClient(
                    maakDummyClient(
                            voornamen[i],
                            achternamen[i],
                            datums[i],
                            notities[i]
                    ) );
        }
        Iterable<Client> c = clientService.findClients();
        for (Client i :c)
        {
                i.addNotitie(clientService.saveNotitie(new Notitie("01-01-2001", "testnotitie 1") ) );
                i.addNotitie(clientService.saveNotitie(new Notitie("02-02-2002", "testnotitie 2") ) );
        }
        System.out.println(" Demo content generated ");
        return " Demo content generated ";
    }
    /**
     *      maak dummy mensen aan met deze methode
     */
    private Client maakDummyClient(String vnaam, String anaam, String date, String note)
    {
        return new Client(
                clientService.savePersoonsgegevens(
                        new Persoonsgegevens(vnaam, anaam) ),
                clientService.saveNotitie(
                        new Notitie(date, note) )
        );
    }
    /**
     *      DUMMY CONTENT
     */
    String [] voornamen = new String[] {
            "Rachelle",
            "Michiel",
            "Bracha",
            "Trees",
            "Patricia",
            "Sanne",
            "Dawa",
            "Klaas",
            "Kevin",
            "Melissa",
            "Selcan"
    };
    String [] achternamen = new String[] {
            "Philip",
            "Janssens",
            "Elzinga",
            "Pietsersen",
            "Ferreira",
            "Smulders",
            "Ometto",
            "Penninga",
            "van den Brand",
            "Schilder",
            "Batman"
    };
    String [] notities = new String[] {
            "Deze persoon kan heel goed Pilates",
            "Moet nog een beetje oefenen",
            "vooral level 1 oefeningen",
            "pas op met onderrug",
            "is zes weken op vakantie",
            "net terug van zwangerschapsverlof",
            "beginnnen met level 3 oefeningen",
            "veel te gespierd voor pilates",
            "gaat liever rennen",
            "gaat liever zwemmen",
            "heeft gister al hard gesport"
    };
    String [] datums =  new String [] {
            "01-06-2019",
            "02-07-2019",
            "03-08-2019",
            "04-09-2019",
            "05-10-2019",
            "06-11-2019",
            "07-12-2019",
            "08-01-2019",
            "09-02-2019",
            "10-03-2019",
            "28-06-2020"
    };

}
