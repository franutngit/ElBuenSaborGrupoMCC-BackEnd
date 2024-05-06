package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.ILocalidadService;
import com.buenSabor.back.business.services.IProvinciaService;
import com.buenSabor.back.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements ILocalidadService {

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public Localidad asignarProvincia(Long id, Long idProvincia) {
        var localidad = getById(id);
        var provincia = provinciaService.getById(idProvincia);
        localidad.setProvincia(provincia);
        return update(localidad);
    }

}
