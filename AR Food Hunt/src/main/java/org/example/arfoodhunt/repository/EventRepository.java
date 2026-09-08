package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository  extends JpaRepository<Event, String> {
}
