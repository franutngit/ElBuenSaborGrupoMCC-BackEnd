package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.PromocionDto;

import java.util.List;

public interface IPromocionFacade extends IBaseFacade<PromocionDto,Long> {

    PromocionDto asignarImagenes(Long id, List<Long> imagenesIds);
    PromocionDto removerImagenes(Long id, List<Long> imagenesIds);

}
