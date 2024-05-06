package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IEmpresaFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.IEmpresaService;
import com.buenSabor.back.domain.dtos.EmpresaDto;
import com.buenSabor.back.domain.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImpl<Empresa, EmpresaDto,Long> implements IEmpresaFacade {

    public EmpresaFacadeImpl(IBaseService<Empresa, Long> baseService, IBaseMapper<Empresa, EmpresaDto> baseMapper) {
        super(baseService, baseMapper);

    }

    @Autowired
    private IEmpresaService empresaService;


    @Override
    public EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds) {
        return baseMapper.toDTO(empresaService.asignarSucursales(id, sucursalesIds)) ;
    }

    @Override
    public EmpresaDto removerSucursales(Long id, List<Long> sucursalesIds) {
        return baseMapper.toDTO(empresaService.removerSucursales(id, sucursalesIds)) ;
    }
}
