package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.Mapper.ReservationMapper;
import com.example.HelloEvents.App.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private ReservationRepository reservationRepository;
    private ReservationMapper reservationMapper;

    public ReservationService(ReservationRepository reservationRepository, ReservationMapper reservationMapper) {
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
    }
}
