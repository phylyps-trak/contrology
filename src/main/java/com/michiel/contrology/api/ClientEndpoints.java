package com.michiel.contrology.api;

import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Notities;
import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientEndpoints {

    /* todo autowire personrepository */

    /**
     * automatische opvullings endpoint
     */
    @PutMapping
    public Client vulDatabase()
    {
        return maakMensen(
                "Deze persoon kan heel goed Pilates",
                "Rachelle",
                "Philip"
        );
    }

    /**
     * maak dummy mensen aan
     */
    private Client maakMensen(String note, String vnaam, String anaam)
    {
        return new Client(
                new Persoonsgegevens(vnaam, anaam),
                new Notities(note)
        );
    }


}
