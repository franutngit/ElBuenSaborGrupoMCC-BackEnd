package com.buenSabor.back.domain.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetallePedidoDto extends BaseDto{

    private Integer cantidad;
    private Double subTotal;

    private ArticuloDto articulo;
}
