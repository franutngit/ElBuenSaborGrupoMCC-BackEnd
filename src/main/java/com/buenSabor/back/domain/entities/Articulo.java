package com.buenSabor.back.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
public class Articulo extends Base {

    protected String denominacion;
    protected Double precioVenta;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo", fetch = FetchType.LAZY)
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'cliente_id' EN LA TABLA DE LOS MANY
//    @JoinColumn(name = "articulo_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @JoinTable(name = "promocion_articulo",
            joinColumns = @JoinColumn(name = "articulo_id"),
            inverseJoinColumns = @JoinColumn(name = "promocion_id"))
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Promocion> promociones = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulo", fetch = FetchType.LAZY)
//    @JoinColumn(name = "articulo_id")
    @Builder.Default
    private Set<DetallePedido> detallesPedido = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "unidadMedida_id")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida){
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }
}