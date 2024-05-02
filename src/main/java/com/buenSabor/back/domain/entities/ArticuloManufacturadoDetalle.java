package com.buenSabor.back.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class ArticuloManufacturadoDetalle extends Base{


    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "articuloInsumo_id")
    private ArticuloInsumo articuloInsumo;

    @ManyToOne
    @JoinColumn(name = "articuloManufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
