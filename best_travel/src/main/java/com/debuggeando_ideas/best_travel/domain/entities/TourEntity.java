package com.debuggeando_ideas.best_travel.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity(name = "tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TourEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER, // EAGER: Carga todos los datos de la relación
            orphanRemoval = true, // Elimina los datos huérfanos
            mappedBy = "tour" // Donde "fly" es el nombre de la variable en TicketEntity
    )
    private Set<ReservationEntity> reservations;
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
}
