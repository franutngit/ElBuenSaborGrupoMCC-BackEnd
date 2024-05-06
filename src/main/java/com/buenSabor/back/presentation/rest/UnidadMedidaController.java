package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.UnidadMedidaFacadeImpl;
import com.buenSabor.back.domain.dtos.UnidadMedidaDto;
import com.buenSabor.back.domain.entities.UnidadMedida;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaDto,Long, UnidadMedidaFacadeImpl> {
    public UnidadMedidaController(UnidadMedidaFacadeImpl facade) {
        super(facade);
    }
}
