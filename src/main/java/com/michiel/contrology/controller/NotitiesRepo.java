package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Notitie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface NotitiesRepo extends CrudRepository<Notitie, Long> {
}
