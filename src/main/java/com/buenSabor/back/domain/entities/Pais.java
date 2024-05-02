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
public class Pais extends Base{

    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pais", fetch = FetchType.LAZY)
//    @JoinColumn(name = "pais_id")
    @Builder.Default
    private Set<Provincia> provincias = new HashSet<>();

}
