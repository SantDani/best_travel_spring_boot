package com.debuggeando_ideas.best_travel.domain.entities.jpa;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TourEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, // EAGER: Carga todos los datos de la relación
            orphanRemoval = true, // Elimina los datos huérfanos
            mappedBy = "tour" // Donde "fly" es el nombre de la variable en TicketEntity
    )
    private Set<ReservationEntity> reservations;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, // EAGER: Carga todos los datos de la relación
            orphanRemoval = true, // Elimina los datos huérfanos
            mappedBy = "tour" // Donde "fly" es el nombre de la variable en TicketEntity
    )
    private Set<TicketEntity> tickets;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private CustomerEntity customer;

    public void addTicket(TicketEntity ticket) {
        if((Objects.isNull(this.tickets))){
            this.tickets = new HashSet<>();
        }
        tickets.add(ticket);
    }

    public void removeTicket(TicketEntity ticket) {
        if((Objects.isNull(this.tickets))){
            this.tickets = new HashSet<>();
        }
        tickets.remove(ticket);
    }

    public void updateTickets(){
        tickets.forEach(ticket -> ticket.setTour(this));
    }

    public void addReservation(ReservationEntity reservation) {
        if((Objects.isNull(this.reservations))){
            this.reservations = new HashSet<>();
        }
        reservations.add(reservation);
    }

    public void removeReservation(ReservationEntity reservation) {
        if((Objects.isNull(this.reservations))){
            this.reservations = new HashSet<>();
        }
        reservations.remove(reservation);
    }

    public void updateReservations(){
        reservations.forEach(reservation -> reservation.setTour(this));
    }
}
