package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Client;
import com.michiel.contrology.domain.Excercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ExcerciseRepo extends CrudRepository<Excercise, Long>
{

}
