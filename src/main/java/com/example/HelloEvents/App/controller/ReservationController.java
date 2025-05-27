package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {
    private final ReservationService reservationService;


    @PostMapping
    public ReservationDTO addReservation(@RequestBody ReservationDTO reservationDTO) {
        return reservationService.reserver(reservationDTO);
    }


    @GetMapping
        public List<ReservationDTO> getAllReservations(){
            return reservationService.getAllReservation();
        }

        @DeleteMapping("/{id}")
        public void deleteReservationById(@PathVariable Long id ){
             reservationService.deleteReservationById(id);
        }


    }

