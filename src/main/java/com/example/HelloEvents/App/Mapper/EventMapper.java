package com.example.HelloEvents.App.Mapper;

import com.example.HelloEvents.App.DTO.EventDTO;
import com.example.HelloEvents.App.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    EventDTO eventToDto(Event event);
    Event dtoToEvent(EventDTO eventDTO);
}