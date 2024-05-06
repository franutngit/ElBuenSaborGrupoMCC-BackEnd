package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.IDomicilioService;
import com.buenSabor.back.business.services.ILocalidadService;
import com.buenSabor.back.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements IDomicilioService {

    @Autowired
    private ILocalidadService localidadService;

    @Override
    public Domicilio asignarLocalidad(Long id, Long idLocalidad) {
        var domicilio = getById(id);
        var localidad = localidadService.getById(idLocalidad);
        domicilio.setLocalidad(localidad);
        return update(domicilio);
    }
}
