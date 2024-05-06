package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IPromocionFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.IPromocionService;
import com.buenSabor.back.domain.dtos.PromocionDto;
import com.buenSabor.back.domain.entities.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements IPromocionFacade {
    public PromocionFacadeImpl(IBaseService<Promocion, Long> baseService, IBaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPromocionService promocionService;

    @Override
    public PromocionDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public PromocionDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(promocionService.removerImagenes(id,imagenesIds));
    }
}
