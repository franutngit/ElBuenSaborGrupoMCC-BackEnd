package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.ProvinciaDto;

public interface IProvinciaFacade extends IBaseFacade<ProvinciaDto,Long>{

    ProvinciaDto asignarPais(Long id, Long idPais);

}
