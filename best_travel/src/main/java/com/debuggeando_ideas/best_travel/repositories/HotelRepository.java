package com.debuggeando_ideas.best_travel.repositories;

import com.debuggeando_ideas.best_travel.domain.entities.jpa.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
}