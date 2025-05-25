package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;






        @PostMapping("/addReservation")
        public ReservationService addReservation(@RequestBody ReservationDTO reservationDTO){
            return reservationService.Reserver(reservationDTO);
        }

        @GetMapping("/allReservations")
        public List<ReservationDTO> getAllReservations(){
            return reservationService.getAllReservation();
        }

        @GetMapping("/reservation/{id}")
        public ReservationDTO getReservationById(@PathVariable Long id ){
            return reservationService.getReservationById(id);
        }
    }

