package com.buenSabor.back.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Builder
public class UnidadMedida extends Base{

    private String denominacion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidadMedida", fetch = FetchType.LAZY)
//    @JoinColumn(name = "unidadMedida_id")
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
}
