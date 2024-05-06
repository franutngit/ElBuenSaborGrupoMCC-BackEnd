package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.DomicilioFacadeImpl;
import com.buenSabor.back.domain.dtos.DomicilioDto;
import com.buenSabor.back.domain.dtos.ProvinciaDto;
import com.buenSabor.back.domain.entities.Domicilio;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioDto,Long, DomicilioFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(DomicilioController.class);
    public DomicilioController(DomicilioFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarLocalidad/{id}")
    public ResponseEntity<DomicilioDto> asignarLocalidad(@RequestParam Long localidadId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR LOCALIDAD A DOMICILIO ");
        return ResponseEntity.ok(facade.asignarLocalidad(id,localidadId));
    }
}
