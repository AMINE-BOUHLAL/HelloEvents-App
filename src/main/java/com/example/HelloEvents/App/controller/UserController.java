//package com.example.HelloEvents.App.controller;
//
//import com.example.HelloEvents.App.DTO.EventDTO;
//import com.example.HelloEvents.App.DTO.UserDTO;
//import com.example.HelloEvents.App.model.Event;
//import com.example.HelloEvents.App.service.EventService;
//import com.example.HelloEvents.App.service.UserService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class UserController {
//    private final UserService userService;
//
//    public UserController(UserService userService, UserService userService1) {
//        this.userService = userService;
//
//
//    @GetMapping("/GET")
//    public List<User> getUsers() { return UserService.getUsers(); }
//
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
//
//
//}

