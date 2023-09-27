package com.debuggeando_ideas.best_travel.domain.entities.jpa;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ReservationEntity implements Serializable {
    @Id
    private UUID id;
    @Column(name = "date_reservation")
    private LocalDateTime dateTimeReservation;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Integer totalDays;
    private BigDecimal price;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id") // representa la FOREIGN KEY
    private HotelEntity hotel;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_id", nullable = true) // representa la FOREIGN KEY
    private TourEntity tour;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id") // representa la FOREIGN KEY
    private CustomerEntity customer;
}
