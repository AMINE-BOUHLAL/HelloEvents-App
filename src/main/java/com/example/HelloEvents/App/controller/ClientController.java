package com.example.HelloEvents.App.controller;

import com.example.HelloEvents.App.DTO.ClientDTO;
import com.example.HelloEvents.App.model.Client;
import com.example.HelloEvents.App.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/GET")
    public List<Client> getClients() {
        return clientService.getClients(); }

//    @PostMapping("/POST")
//    public UserDTO addUser(@RequestBody UserDTO UserDTO) {
//        return UserService.AddUser(userDTO); }
//
//    @GetMapping("/ID/{id}")
//    public UserDTO getUsersById(@PathVariable Long id){
//        return  UserService.getUsersById(id);
//    }
//
//    @DeleteMapping("/DEL/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        UserService.deleteUser(id);
//    }
//
//    @PutMapping("/PUT/{id}")
//    public UserDTO updateUser(@PathVariable Long id,@RequestBody UserDTO userDTO){
//        return UserService.updateUser(id,userDTO);
//    }
//
//


}

