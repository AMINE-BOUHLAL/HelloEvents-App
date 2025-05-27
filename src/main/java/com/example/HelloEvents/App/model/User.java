package com.example.HelloEvents.App.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Inheritance(strategy = InheritanceType.JOINED)  //id dans table client
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO  ID
    private Long id;

    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String password;


}
