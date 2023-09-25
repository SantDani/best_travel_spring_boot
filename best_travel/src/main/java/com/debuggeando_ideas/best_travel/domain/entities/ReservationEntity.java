package com.debuggeando_ideas.best_travel.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
@Entity
@Data
public class TicketEntity implements Serializable {
    @Id
    private UUID id;
    @Column(name = "date_reservation")
    private String dateTimeReservation;
    private String address;
    private int rating;
    private BigDecimal price;
}
