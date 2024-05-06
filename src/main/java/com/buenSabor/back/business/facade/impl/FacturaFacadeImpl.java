package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IFacturaFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.FacturaDto;
import com.buenSabor.back.domain.entities.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto,Long> implements IFacturaFacade {
    public FacturaFacadeImpl(IBaseService<Factura, Long> baseService, IBaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
