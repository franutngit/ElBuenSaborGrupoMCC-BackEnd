package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.DomicilioDto;

public interface IDomicilioFacade extends IBaseFacade<DomicilioDto,Long>{
    DomicilioDto asignarLocalidad(Long id, Long idLocalidad);
}
