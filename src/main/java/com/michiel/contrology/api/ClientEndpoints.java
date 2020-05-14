package com.michiel.contrology.api;

import com.michiel.contrology.controller.ClientService;
import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Notities;
import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clients")
public class ClientEndpoints
{
    @Autowired
    ClientService clientService;

    /**
     *      savetest
     */

    
    /**
     *      automatische opvullings endpoint
     */
    //@PostMapping
    public void vulDatabase()
    {
        for( int i = 0; i<voornamen.length; i++)
        {
            //clientService.saveClient( maakDummyClient(voornamen[i], achternamen[i], notities[i]) );
            //System.out.println( maakDummyClient(voornamen[i], achternamen[i], notities[i]) );
            Client x = maakDummyClient("Henk", "Jansen", "kan er niks van");
            System.out.printf(x.toString());
            //clientService.saveClient( x );
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
            "Sanne"
    };
    String [] achternamen = new String[] {
            "Philip",
            "Janssens",
            "de Boom",
            "Elzinga",
            "Pietsersen",
            "Ferreira",
            "Smulders"
    };
    String [] notities = new String[] {
            "Deze persoon kan heel goed Pilates",
            "Moet nog een beetje oefenen",
            "vooral level 1 oefeningen",
            "pas op met onderrug",
            "is zes weken op vakantie",
            "net terug van zwangerschapsverlof",
            "beginnnen met level 3 oefeningen"
    };


}
