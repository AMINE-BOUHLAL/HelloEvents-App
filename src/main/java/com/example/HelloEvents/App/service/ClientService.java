package com.example.HelloEvents.App.service;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.Mapper.ClientMapper;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;



    public List<ClientDTO> getClients() {
        return clientRepository.findAll().stream()
        .map(client -> clientMapper.clientToDto(client))
                .toList();
    }

    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    public ClientDTO AddClient(ClientDTO clientDTO){
       return clientMapper.clientToDto(clientRepository.save(clientMapper.dtoToclient(clientDTO)));
    }

    public ClientDTO UpdateClient(Long id,ClientDTO clientDTO){
    Client client = clientRepository.findById(id).get();
    client.setName(clientDTO.getName());
    client.setEmail(clientDTO.getEmail());
    client.setRole(clientDTO.getRole());
    client.setPassword(clientDTO.getPassword());
    return clientMapper.clientToDto(clientRepository.save(client));

    }

    public ClientDTO getClientById(Long id) {
        return clientRepository.findById(id)
                .map(client -> clientMapper.clientToDto(client))
                .orElse(null);

    }


}
