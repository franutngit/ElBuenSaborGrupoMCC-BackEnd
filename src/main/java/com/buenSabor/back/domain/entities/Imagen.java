package com.buenSabor.back.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class Imagen extends Base{

    private String url;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    @OneToOne
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "promocion_id")
    private Promocion promocion;
}
