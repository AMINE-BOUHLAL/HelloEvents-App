package com.example.HelloEvents.App.DTO;

import com.example.HelloEvents.App.model.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter           //getters and setters
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@BUILDER pour les objects
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
