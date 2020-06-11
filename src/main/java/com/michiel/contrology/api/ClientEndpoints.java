package com.michiel.contrology.api;

import com.michiel.contrology.controller.ClientService;
import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Notities;
import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientEndpoints
{
    @Autowired
    ClientService clientService;
    /**
     *      get 1 Client by ID
     */
    @GetMapping("/{id}")
    private Client getClient(@PathVariable(value = "id") String clientId)
    {
        return clientService.findClientById(Long.parseLong(clientId));
    }
    /**
     *      get alle clienten
     */
    @GetMapping
    private Iterable getAllClients()
    {
        return clientService.findClients();
    }

    //TODO laat autogenerate data voor database ergens anders gebeuren
    /**
     *      maak dummy mensen aan met dit endpoint (gebruikt onderstaande methode)
     */
    @GetMapping("/dummy")
    public void generateDummyClients()
    {
        for( int i = 0; i<voornamen.length; i++ )
        {
            clientService.saveClient(
                    maakDummyClient(
                            voornamen[i],
                            achternamen[i],
                            notities[i]
                    ) );
        }
    }
    /**
     *      maak dummy mensen aan met deze methode
     */
    private Client maakDummyClient(String vnaam, String anaam,String note)
    {
        return new Client(
                clientService.savePersoonsgegevens(
                        new Persoonsgegevens(vnaam, anaam) ),
                clientService.saveNotities(
                        new Notities(note) )
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
            "Alexander",
            "Patricia",
            "Sanne",
            "Dawa",
            "Klaas",
            "Kevin"
    };
    String [] achternamen = new String[] {
            "Philip",
            "Janssens",
            "de Boom",
            "Elzinga",
            "Pietsersen",
            "Ferreira",
            "Smulders",
            "Ometto",
            "Penninga",
            "van den Brand"
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
            "gaat ook liever rennen"
    };

}
