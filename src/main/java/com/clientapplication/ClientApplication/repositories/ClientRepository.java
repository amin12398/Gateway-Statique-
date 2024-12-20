package com.clientapplication.ClientApplication.repositories;

import com.clientapplication.ClientApplication.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
