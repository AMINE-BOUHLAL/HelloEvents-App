package com.example.HelloEvents.App.Mapper;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

    ClientDTO clientToDto(Client client);
    Client dtoToclient(ClientDTO clientDTO);
}