package com.buenSabor.back.domain.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProvinciaDto extends BaseDto{

    private String nombre;
    private PaisDto pais;

}
