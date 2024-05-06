package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IProvinciaFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.IProvinciaService;
import com.buenSabor.back.domain.dtos.ProvinciaDto;
import com.buenSabor.back.domain.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto,Long> implements IProvinciaFacade {
    public ProvinciaFacadeImpl(IBaseService<Provincia, Long> baseService, IBaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public ProvinciaDto asignarPais(Long id, Long idPais) {
        return baseMapper.toDTO(provinciaService.asignarPais(id,idPais));
    }

}
