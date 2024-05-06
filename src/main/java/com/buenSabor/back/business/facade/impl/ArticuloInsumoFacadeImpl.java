package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IArticuloInsumoFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IArticuloInsumoService;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.ArticuloInsumoDto;
import com.buenSabor.back.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoFacadeImpl extends BaseFacadeImpl<ArticuloInsumo, ArticuloInsumoDto,Long> implements IArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(IBaseService<ArticuloInsumo, Long> baseService, IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IArticuloInsumoService articuloInsumoService;

    @Override
    public ArticuloInsumoDto asignarImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.asignarImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto removerImagenes(Long id, List<Long> imagenesIds) {
        return baseMapper.toDTO(articuloInsumoService.removerImagenes(id,imagenesIds));
    }

    @Override
    public ArticuloInsumoDto asignarUnidadMedida(Long id, Long unidadMedidaId) {
        return baseMapper.toDTO(articuloInsumoService.asignarUnidadMedida(id,unidadMedidaId));
    }

}
