package com.debuggeando_ideas.best_travel.repositories;


import com.debuggeando_ideas.best_travel.domain.entities.jpa.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
