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



    public List<Client> getClients() {
        return clientRepository.findAll();
    }






    public void deleteEvent(Long id) {
        clientRepository.deleteById(id);
    }



    public ClientDTO AddClient(ClientDTO clientDTO){
        var client = clientMapper.dtoToclient(clientDTO);
        client.setId(null);
        return clientMapper.clientToDto(clientRepository.save(client));
    }

//    public ClientDTO getClientsById(Long id) {
//        return clientRepository.findById(id)
//                .map(client -> ClientMapper.(client))
//                .orElse(null);
//
//    }

    public ClientDTO updateClient(Long id , ClientDTO clientDTO) {
        Client client = (Client) clientRepository.findById(id).get();
        client.setName(clientDTO.getName());
        client.setEmail(clientDTO.getEmail());
        client.setPassword(clientDTO.getPassword());
        return clientMapper.clientToDto(clientRepository.save(client));


    }
}
