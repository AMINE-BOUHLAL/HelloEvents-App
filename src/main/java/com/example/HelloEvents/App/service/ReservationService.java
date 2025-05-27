package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.DTO.ReservationDTO;
import com.example.HelloEvents.App.Mapper.ReservationMapper;
import com.example.HelloEvents.App.model.Client;
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
    public ReservationDTO reserver(ReservationDTO reservationDTO){
        var client = clientRepository.findById(reservationDTO.getClientId())
                .orElseThrow(() -> new RuntimeException("Client not found with ID: " + reservationDTO.getClientId()));

        var event = eventRepository.findById(reservationDTO.getEventId())
                .orElseThrow(() -> new RuntimeException("Event not found with ID: " + reservationDTO.getEventId()));

        var res = reservationRepository.save(new Reservation(null,client,event));
        return new ReservationDTO(res.getIdreservation(), res.getClient().getId(), res.getEvent().getId());
    }

    public List<ReservationDTO> getAllReservation(){

        return reservationRepository.findAll().stream()
                .map(reservationMapper::reservationToDTO)
                .toList();
    }

    public ReservationDTO getReservationById(Long id){
        return reservationRepository.findById(id)
                .map(reservationMapper::reservationToDTO)
                .orElseThrow(()->new RuntimeException("Reservation Not Found"));
    }


    public  void deleteReservationById(Long id) {
         reservationRepository.deleteById(id);
    }
}
