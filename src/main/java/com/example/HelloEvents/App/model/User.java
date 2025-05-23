package com.example.HelloEvents.App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
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
