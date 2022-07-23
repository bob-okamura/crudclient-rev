package com.bobhome.crudclientrev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bobhome.crudclientrev.entities.Client;

@Repository
public interface ClientRepositoty extends JpaRepository<Client, Long>{

}
