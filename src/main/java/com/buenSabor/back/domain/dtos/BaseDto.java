package com.buenSabor.back.domain.dtos;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BaseDto {
    protected Long id;

}
