package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.Provincia;

public interface IProvinciaService extends IBaseService<Provincia,Long>{
    Provincia asignarPais(Long id, Long idPais);
}
