package com.michiel.contrology.controller;

import com.michiel.contrology.domain.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClientRepo extends CrudRepository<Client, Long>
{
    List<Client> findByEmailAddressAndLastname(String emailAddress, String lastname);
    // is gelijk aan:
    // select u from User u where u.emailAddress = ?1 and u.lastname = ?2

    /**
     * Test methode om coole zoekmanieren in te bouwen
     * @param docent
     * @return
     */
    @Query(value = "SELECT * FROM USERS WHERE DOCENT = ?1", nativeQuery = true)
    Client findByDocent(String docent);

}
