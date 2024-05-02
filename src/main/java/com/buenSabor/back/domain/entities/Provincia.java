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
public class Provincia extends Base{

    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provincia", fetch = FetchType.LAZY)
//    @JoinColumn(name = "provincia_id")
    @Builder.Default
    private Set<Localidad> localidades = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;

}
