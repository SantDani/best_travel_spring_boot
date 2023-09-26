package com.debuggeando_ideas.best_travel.repositories;


import com.debuggeando_ideas.best_travel.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<FlyEntity, Long> {
}
