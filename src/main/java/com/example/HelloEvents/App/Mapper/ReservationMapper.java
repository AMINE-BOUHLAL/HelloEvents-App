package com.example.HelloEvents.App.Mapper;

import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    @Mapping(source = "idreservation", target = "idReservation")
    @Mapping(source = "client.id", target = "clientId")
    @Mapping(source = "event.id", target = "eventId")
    ReservationDTO reservationToDTO(Reservation reservation);


    @Mapping(source = "clientId", target = "client.id")
    @Mapping(source = "eventId", target = "event.id")
    Reservation dtoToReservation(ReservationDTO reservationDTO);
}
