package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.Sucursal;
import java.util.List;

public interface ISucursalService extends IBaseService<Sucursal,Long>{

    Sucursal asignarDomicilio(Long id, Long idDomicilio);
    Sucursal asignarCategorias(Long id, List<Long> categoriasIds);
    Sucursal removerCategorias(Long id, List<Long> categoriasIds);
    Sucursal asignarPromociones(Long id, List<Long> promocionesIds);
    Sucursal removerPromociones(Long id, List<Long> promocionesIds);
}
