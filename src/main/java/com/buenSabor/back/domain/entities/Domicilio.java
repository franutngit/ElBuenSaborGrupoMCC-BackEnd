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
public class Domicilio extends Base{

    private String calle;
    private Integer numero;
    private Integer cp;
    private Integer piso;
    private Integer nroDpto;

    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidad;

    @ManyToMany
    //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @JoinTable(name = "cliente_domicilio",
            joinColumns = @JoinColumn(name = "domicilio_id"),
            inverseJoinColumns = @JoinColumn(name = "cliente_id"))
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Cliente> clientes = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domicilio", fetch = FetchType.LAZY)
//    @JoinColumn(name = "domicilio_id")
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();

    @OneToOne
    private Sucursal sucursal;
}
