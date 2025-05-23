package com.example.HelloEvents.App.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Admin extends User {
    public Admin() {
        this.setRole(Role.CLIENT);
    }

    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Reservation> reservations;
}
