package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Client")

public class ClientController {
    private final ClientService clientService;


    @GetMapping("/")
    public List<ClientDTO> getClients() {
        return clientService.getClients(); }

    @PostMapping("/")
    public ClientDTO AddClient(ClientDTO clientDTO) {
        return clientService.AddClient(clientDTO);
    }

    @PutMapping("/{id}")
    public ClientDTO UpdateClient(@PathVariable Long id,ClientDTO clientDTO) {
        return clientService.UpdateClient(id,clientDTO);
    }
//
//    @GetMapping("/ID/{id}")
//    public ClientDTO getClientById(@PathVariable Long id){
//        return  ClientService.getClientById(id);
//    }
//
    @DeleteMapping("/DEL/{id}")
    public void deleteClient(@PathVariable Long id) {
        ClientService.deleteClient(id);
    }




}

