    package com.debuggeando_ideas.best_travel.domain.entities.jpa;

    // Jacarkta es la nueva versión de Java EE, por lo que se debe importar la nueva librería
    // Esta una de las principales con la versión anterior
    import com.debuggeando_ideas.best_travel.util.AeroLine;
    import jakarta.persistence.*;
    import lombok.*;

    import java.io.Serializable;
    import java.math.BigDecimal;
    import java.util.Set;


    @Entity(name = "fly")
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public class FlyEntity implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Double originLat;
        private Double originLng;
        private Double destinyLat;
        private Double destinyLng;
        @Column(length = 20)
        private String originName;
        @Column(length = 20)
        private String destinyName;
        private BigDecimal price;
        @Enumerated(EnumType.STRING)
        private AeroLine aeroLine;


        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        @OneToMany(
                cascade = CascadeType.ALL,
                fetch = FetchType.EAGER, // EAGER: Carga todos los datos de la relación
                orphanRemoval = true, // Elimina los datos huérfanos
                mappedBy = "fly" // Donde "fly" es el nombre de la variable en TicketEntity
        )
        private Set<TicketEntity> tickets;




    }
