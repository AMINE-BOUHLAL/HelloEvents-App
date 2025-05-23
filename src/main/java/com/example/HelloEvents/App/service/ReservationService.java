package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.Mapper.ReservationMapper;
import com.example.HelloEvents.App.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ReservationService {
    private ReservationRepository reservationRepository;
    private ReservationMapper reservationMapper;
}
