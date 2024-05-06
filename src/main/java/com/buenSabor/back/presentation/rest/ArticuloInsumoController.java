package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.ArticuloInsumoFacadeImpl;
import com.buenSabor.back.domain.dtos.ArticuloInsumoDto;
import com.buenSabor.back.domain.dtos.ArticuloManufacturadoDto;
import com.buenSabor.back.domain.entities.ArticuloInsumo;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulosInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoDto,Long, ArticuloInsumoFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(ArticuloInsumoController.class);
    public ArticuloInsumoController(ArticuloInsumoFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<ArticuloInsumoDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<ArticuloInsumoDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }

    @PutMapping("/asignarUnidadMedida/{id}")
    public ResponseEntity<ArticuloInsumoDto> asignarUnidadMedida(@RequestParam Long unidadMedidaId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarUnidadMedida(id,unidadMedidaId));
    }

}
