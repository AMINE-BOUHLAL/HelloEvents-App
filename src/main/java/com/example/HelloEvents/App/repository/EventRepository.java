package com.example.HelloEvents.App.repository;

import com.example.HelloEvents.App.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> id(Long id);
}
