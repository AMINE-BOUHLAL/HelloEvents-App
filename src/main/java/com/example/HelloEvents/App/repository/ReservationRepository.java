package com.example.HelloEvents.App.repository;

import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {


}
