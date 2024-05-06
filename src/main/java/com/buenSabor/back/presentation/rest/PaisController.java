package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.PaisFacadeImpl;
import com.buenSabor.back.domain.dtos.PaisDto;
import com.buenSabor.back.domain.entities.Pais;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseControllerImpl<Pais,PaisDto,Long, PaisFacadeImpl>{
    public PaisController(PaisFacadeImpl facade) {
        super(facade);
    }

}
