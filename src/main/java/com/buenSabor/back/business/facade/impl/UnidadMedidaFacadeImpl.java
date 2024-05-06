package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.UnidadMedidaDto;
import com.buenSabor.back.domain.entities.UnidadMedida;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImpl extends BaseFacadeImpl<UnidadMedida, UnidadMedidaDto,Long>{
    public UnidadMedidaFacadeImpl(IBaseService<UnidadMedida, Long> baseService, IBaseMapper<UnidadMedida, UnidadMedidaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
