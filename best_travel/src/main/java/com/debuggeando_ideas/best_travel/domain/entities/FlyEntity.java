package com.debuggeando_ideas.best_travel.domain.entities;

// Jacarkta es la nueva versión de Java EE, por lo que se debe importar la nueva librería
// Esta una de las principales con la versión anterior
import com.debuggeando_ideas.best_travel.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


@Entity(name = "fly")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FlyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinityLng;
    private Double destinityLat;
    private BigDecimal price;
    @Column(length = 20)
    private String originName;
    @Column(length = 20)
    private String destinityName;
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private AeroLine areoLine;




}
