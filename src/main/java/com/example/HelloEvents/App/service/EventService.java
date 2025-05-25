package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.DTO.EventDTO;
import com.example.HelloEvents.App.Mapper.EventMapper;
import com.example.HelloEvents.App.model.Event;
import com.example.HelloEvents.App.repository.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventService {
    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }






    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    public List<EventDTO> getEvents() {
        return eventRepository.findAll().stream()
                .map(event -> eventMapper.eventToDto(event))
                .toList();
    }

    public EventDTO AddEvent(EventDTO eventDTO){
        var event = eventMapper.dtoToEvent(eventDTO);
        event.setId(null);
     return eventMapper.eventToDto(eventRepository.save(event));
    }

    public EventDTO getEventsById(Long id) {
        return eventRepository.findById(id)
                .map(event -> eventMapper.eventToDto(event))
                .orElse(null);

    }

    public EventDTO updateEvent(Long id , EventDTO eventDTO) {
        Event event = eventRepository.findById(id).get();
        event.setName(eventDTO.getName());
        event.setType(eventDTO.getType());
        event.setDescription(eventDTO.getDescription());
        return eventMapper.eventToDto(eventRepository.save(event));


    }
}

