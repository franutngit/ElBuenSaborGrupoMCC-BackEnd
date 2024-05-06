package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.LocalidadDto;

public interface ILocalidadFacade extends IBaseFacade<LocalidadDto,Long>{
    LocalidadDto asignarProvincia(Long id, Long idProvincia);
}
