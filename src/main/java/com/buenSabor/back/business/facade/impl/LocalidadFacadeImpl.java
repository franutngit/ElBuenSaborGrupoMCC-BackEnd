package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.ILocalidadFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.ILocalidadService;
import com.buenSabor.back.domain.dtos.LocalidadDto;
import com.buenSabor.back.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto,Long> implements ILocalidadFacade {
    public LocalidadFacadeImpl(IBaseService<Localidad, Long> baseService, IBaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public LocalidadDto asignarProvincia(Long id, Long idProvincia) {
        return baseMapper.toDTO(localidadService.asignarProvincia(id,idProvincia));
    }

}
