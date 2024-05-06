package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.ArticuloInsumoDto;

import java.util.List;


public interface IArticuloInsumoFacade extends IBaseFacade<ArticuloInsumoDto,Long>{
    ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId);
}
