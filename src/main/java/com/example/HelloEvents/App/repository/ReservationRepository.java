package com.example.HelloEvents.App.repository;

import com.example.HelloEvents.App.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
