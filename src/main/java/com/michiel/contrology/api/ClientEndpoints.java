package com.michiel.contrology.api;

import com.michiel.contrology.controller.ClientService;
import com.michiel.contrology.domain.Client;
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
    @GetMapping("/id/{id}")
    private Client getClientById(@PathVariable(value = "id") String clientId)
    {
        return clientService.findClientById(Long.parseLong(clientId));
    }

    /**
     * get 1 client by voornaam
     * @param clientVoornaam
     * @return
     */

    @GetMapping("/naam/{naam}")
    private Client getClientByName(@PathVariable(value = "naam") String clientVoornaam)
    {
        return clientService.findClientByVoornaam(clientVoornaam);
    }


    /**
     *      get alle clienten
     */
    @GetMapping
    private Iterable getAllClients()
    {
        return clientService.findClients();
    }
}
