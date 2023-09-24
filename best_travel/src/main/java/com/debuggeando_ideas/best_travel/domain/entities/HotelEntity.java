package com.debuggeando_ideas.best_travel.domain.entities;

import com.debuggeando_ideas.best_travel.util.AeroLine;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
@Entity(name = "hotel")
public class HotelEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String address;
    private int rating;
    private BigDecimal price;


}
