package org.example.arfoodhunt.repository;

import org.example.arfoodhunt.entity.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository  extends JpaRepository<Collection, String> {
}
