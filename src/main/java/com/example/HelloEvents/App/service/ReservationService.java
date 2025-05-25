package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.Mapper.ReservationMapper;
import com.example.HelloEvents.App.model.Reservation;
import com.example.HelloEvents.App.repository.ClientRepository;
import com.example.HelloEvents.App.repository.EventRepository;
import com.example.HelloEvents.App.repository.ReservationRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final EventRepository eventRepository;
    private final ReservationMapper reservationMapper;



    @Transactional
    public ReservationDTO Resrever(ReservationDTO reservatioDto){
        var client = clientRepository.findById(reservatioDto.getClientid()).orElse(null);
        var event = eventRepository.findById(reservatioDto.getEventId()).orElse(null);

        var res = reservationRepository.save(new Reservation(null,client,event));
        return new ReservationDTO(res.getIdreservation(), res.getClient().getId(), res.getEvenement().getIdEvent());
    }

    public List<ReservationDTO> getAllReservation(){
        return reservationRepository.findAll().stream()
                .map(res->reservationMapper.reservationToDto(res))
                .toList();
    }

    public ReservationDTO getReservationById(Long id){
        return reservationRepository.findById(id)
                .map(ress->reservationMapper.reservationToDto(ress))
                .orElseThrow(()->new RuntimeException("Reservation Not Found"));
    }



}
