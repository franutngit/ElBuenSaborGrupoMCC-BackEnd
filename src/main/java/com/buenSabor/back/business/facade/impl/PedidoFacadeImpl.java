package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IPedidoFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.IPedidoService;
import com.buenSabor.back.domain.dtos.PedidoDto;
import com.buenSabor.back.domain.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido,PedidoDto,Long> implements IPedidoFacade {

    public PedidoFacadeImpl(IBaseService<Pedido, Long> baseService, IBaseMapper<Pedido,PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IPedidoService pedidoService;

    @Override
    public PedidoDto createNew(PedidoDto request) {
        var entityToCreate = baseMapper.toEntity(request);
        var entityCreated = pedidoService.create(entityToCreate,request.getDomicilioId(),request.getSucursalId());
        return baseMapper.toDTO(entityCreated);
    }
}
