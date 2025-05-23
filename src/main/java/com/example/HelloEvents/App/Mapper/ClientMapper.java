package com.example.HelloEvents.App.Mapper;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.DTO.EventDTO;
import com.example.HelloEvents.App.DTO.UserDTO;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.model.Event;
import com.example.HelloEvents.App.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

    ClientDTO clientToDto(Client client);
    Client dtoToclient(ClientDTO clientDTO);
}