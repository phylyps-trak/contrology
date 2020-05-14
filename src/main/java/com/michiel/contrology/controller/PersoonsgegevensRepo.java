package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Persoonsgegevens;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersoonsgegevensRepo extends CrudRepository<Persoonsgegevens, Long> {
}
