package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.FacturaFacadeImpl;
import com.buenSabor.back.domain.dtos.FacturaDto;
import com.buenSabor.back.domain.entities.Factura;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl>  {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }
}
