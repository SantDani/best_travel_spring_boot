package com.debuggeando_ideas.best_travel.repositories;

import com.debuggeando_ideas.best_travel.domain.entities.jpa.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Class HotelRepository
 *
 * <p> Using a Supported keywords inside method names <p/>
 *
 * <link><a href="https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html">Link to Doc</a></link>
 */
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {

    Set<HotelEntity> findByRatingGreaterThan(Integer rating);
    Set<HotelEntity> findByPriceLessThan(BigDecimal price);

    Set<HotelEntity> findByPriceBetween(BigDecimal min, BigDecimal max);




}
