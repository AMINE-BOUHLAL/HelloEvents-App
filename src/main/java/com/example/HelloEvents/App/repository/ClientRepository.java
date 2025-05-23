package com.example.HelloEvents.App.repository;

import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
