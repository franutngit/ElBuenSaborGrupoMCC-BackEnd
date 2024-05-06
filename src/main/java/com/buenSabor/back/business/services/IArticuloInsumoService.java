package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.ArticuloInsumo;

import java.util.List;

public interface IArticuloInsumoService extends IBaseService<ArticuloInsumo,Long>{

    ArticuloInsumo asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo asignarUnidadMedida(Long id, Long unidadMedidaId);
}
