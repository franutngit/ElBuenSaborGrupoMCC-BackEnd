package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.Localidad;

public interface ILocalidadService extends IBaseService<Localidad,Long>{
    Localidad asignarProvincia(Long id, Long idProvincia);
}
