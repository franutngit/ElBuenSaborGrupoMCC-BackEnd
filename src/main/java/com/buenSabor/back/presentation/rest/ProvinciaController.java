package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.ProvinciaFacadeImpl;
import com.buenSabor.back.domain.dtos.ProvinciaDto;
import com.buenSabor.back.domain.entities.Provincia;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaDto,Long, ProvinciaFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(ProvinciaController.class);
    public ProvinciaController(ProvinciaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarPais/{id}")
    public ResponseEntity<ProvinciaDto> asignarPais(@RequestParam Long paisId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR PAIS A PROVINCIA");
        return ResponseEntity.ok(facade.asignarPais(id,paisId));
    }

}
