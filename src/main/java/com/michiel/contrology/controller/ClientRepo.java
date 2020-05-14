package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClientRepo extends CrudRepository<Client, Long>
{

}
