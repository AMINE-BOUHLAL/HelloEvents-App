package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.EventDTO;
import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.model.Event;
import com.example.HelloEvents.App.model.Reservation;
import com.example.HelloEvents.App.service.EventService;
import com.example.HelloEvents.App.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor

public class ReservationController {
    public ReservationService reservationService;




    @GetMapping("/GET")
    public List<Reservation> getReservation() { return reservationService.getReservation(); }

    @PostMapping("/POST")
    public ReservationDTO addReservation(@RequestBody ReservationDTO reservationDTO) {
        return reservationService.AddEvent(reservationDTO); }

    @GetMapping("/ID/{id}")
    public ReservationDTO getReservationById(@PathVariable Long id){
        return  reservationService.getReservationById(id);
    }

    @DeleteMapping("/DEL/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @PutMapping("/PUT/{id}")
    public ReservationDTO updateReservation(@PathVariable Long id, @RequestBody ReservationDTO reservationDTO){
        return reservationService.updateReservation(id,reservationDTO);
    }