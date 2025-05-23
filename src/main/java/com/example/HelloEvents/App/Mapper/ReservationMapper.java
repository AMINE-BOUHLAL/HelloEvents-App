package com.example.HelloEvents.App.Mapper;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    ReservationDTO reservationToDto(Reservation reservation);
    Reservation dtoToreservation(ReservationDTO reservationDTO);
}