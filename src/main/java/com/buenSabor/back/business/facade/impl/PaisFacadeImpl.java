package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IPaisFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.PaisDto;
import com.buenSabor.back.domain.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto,Long> implements IPaisFacade {

    public PaisFacadeImpl(IBaseService<Pais, Long> baseService, IBaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
