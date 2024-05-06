package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IDomicilioFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.IDomicilioService;
import com.buenSabor.back.domain.dtos.DomicilioDto;
import com.buenSabor.back.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto,Long> implements IDomicilioFacade {
    public DomicilioFacadeImpl(IBaseService<Domicilio, Long> baseService, IBaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IDomicilioService domicilioService;

    @Override
    public DomicilioDto asignarLocalidad(Long id, Long idLocalidad) {
        return baseMapper.toDTO(domicilioService.asignarLocalidad(id,idLocalidad));
    }
}
