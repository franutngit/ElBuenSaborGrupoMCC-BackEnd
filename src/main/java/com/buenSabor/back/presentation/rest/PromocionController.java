package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.PromocionFacadeImpl;
import com.buenSabor.back.domain.dtos.PromocionDto;
import com.buenSabor.back.domain.entities.Promocion;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionDto, Long, PromocionFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(PromocionController.class);
    public PromocionController(PromocionFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<PromocionDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<PromocionDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER IMAGENES A PROMOCION");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }
}
