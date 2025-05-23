package com.example.HelloEvents.App.DTO;

import lombok.*;

@Getter           //getters and setters
@Setter
@AllArgsConstructor
@NoArgsConstructor
                                //@BUILDER pour les objects
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private String type;
}
