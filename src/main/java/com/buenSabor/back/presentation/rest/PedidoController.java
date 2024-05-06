package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.PedidoFacadeImpl;
import com.buenSabor.back.domain.dtos.PedidoDto;
import com.buenSabor.back.domain.entities.Pedido;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }


}
