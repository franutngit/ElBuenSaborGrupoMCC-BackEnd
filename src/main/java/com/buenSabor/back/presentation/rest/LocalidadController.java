package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.LocalidadFacadeImpl;
import com.buenSabor.back.domain.dtos.LocalidadDto;
import com.buenSabor.back.domain.entities.Localidad;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadDto,Long, LocalidadFacadeImpl> {
    private static final Logger logger = LoggerFactory.getLogger(LocalidadController.class);
    public LocalidadController(LocalidadFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarProvincia/{id}")
    public ResponseEntity<LocalidadDto> asignarProvincia(@RequestParam Long provinciaId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR PROVINCIA A LOCALIDAD");
        return ResponseEntity.ok(facade.asignarProvincia(id,provinciaId));
    }

}
