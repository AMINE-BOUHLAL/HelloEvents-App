package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.EventDTO;
import com.example.HelloEvents.App.model.Event;
import com.example.HelloEvents.App.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) { this.eventService = eventService;}

    @GetMapping("/GET")
    public List<EventDTO> getEvents() { return eventService.getEvents(); }

    @PostMapping("/POST")
    public EventDTO addEvent(@RequestBody EventDTO eventDTO) {
        return eventService.AddEvent(eventDTO); }

    @GetMapping("/ID/{id}")
    public EventDTO getEventsById(@PathVariable Long id){
        return  eventService.getEventsById(id);
    }

    @DeleteMapping("/DEL/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }

    @PutMapping("/PUT/{id}")
    public EventDTO updateEvent(@PathVariable Long id,@RequestBody EventDTO eventDTO){
        return eventService.updateEvent(id,eventDTO);
    }




}
