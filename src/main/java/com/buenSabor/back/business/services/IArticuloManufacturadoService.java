package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.ArticuloManufacturado;

import java.util.List;

public interface IArticuloManufacturadoService extends IBaseService<ArticuloManufacturado,Long>{

    ArticuloManufacturado asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado asignarUnidadMedida(Long id, Long unidadMedidaId);

}
