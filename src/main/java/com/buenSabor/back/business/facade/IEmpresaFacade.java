package com.buenSabor.back.business.facade;

import com.buenSabor.back.domain.dtos.EmpresaDto;

import java.util.List;

public interface IEmpresaFacade extends IBaseFacade<EmpresaDto,Long>{
    EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds);
    EmpresaDto removerSucursales(Long id, List<Long> sucursalesIds);
}
