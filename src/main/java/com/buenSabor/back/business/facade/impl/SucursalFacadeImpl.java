package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.ISucursalFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.ISucursalService;
import com.buenSabor.back.domain.dtos.SucursalDto;
import com.buenSabor.back.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalFacadeImpl extends BaseFacadeImpl<Sucursal, SucursalDto,Long> implements ISucursalFacade {
    public SucursalFacadeImpl(IBaseService<Sucursal, Long> baseService, IBaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ISucursalService sucursalService;

    @Override
    public SucursalDto asignarDocimilio(Long id, Long idDomicilio) {
        return baseMapper.toDTO(sucursalService.asignarDomicilio(id,idDomicilio));
    }

    @Override
    public SucursalDto asignarCategorias(Long id, List<Long> categoriasIds) {
        return baseMapper.toDTO(sucursalService.asignarCategorias(id,categoriasIds));
    }

    @Override
    public SucursalDto removerCategorias(Long id, List<Long> categoriasIds) {
        return baseMapper.toDTO(sucursalService.removerCategorias(id,categoriasIds));
    }

    @Override
    public SucursalDto asignarPromociones(Long id, List<Long> promocionesIds) {
        return baseMapper.toDTO(sucursalService.asignarPromociones(id,promocionesIds));
    }

    @Override
    public SucursalDto removerPromociones(Long id, List<Long> promocionesIds) {
        return baseMapper.toDTO(sucursalService.removerPromociones(id,promocionesIds));
    }
}
