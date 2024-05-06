package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.Pedido;


public interface IPedidoService extends IBaseService<Pedido,Long>{
    Pedido create(Pedido entity, Long domicilioId, Long sucursalId);
}
