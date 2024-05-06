package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.ClienteFacadeImpl;
import com.buenSabor.back.domain.dtos.ClienteDto;
import com.buenSabor.back.domain.entities.Cliente;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteDto,Long, ClienteFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(ClienteController.class);
    public ClienteController(ClienteFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarUsuario/{id}")
    public ResponseEntity<ClienteDto> asignarUsuario(@RequestParam Long usuarioId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR USUARIO A CLIENTE");
        return ResponseEntity.ok(facade.asignarUsuario(id,usuarioId));
    }

    @PutMapping("/asignarImagen/{id}")
    public ResponseEntity<ClienteDto> asignarImagen(@RequestParam Long imagenId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR IMAGEN A CLIENTE");
        return ResponseEntity.ok(facade.asignarImagen(id,imagenId));
    }

    @PutMapping("/asignarDomicilios/{id}")
    public ResponseEntity<ClienteDto> asignarDomicilios(@RequestParam List<Long> domiciliosIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR DOMICILIOS A CLIENTE");
        return ResponseEntity.ok(facade.asignarDomicilios(id,domiciliosIds));
    }

    @PutMapping("/removerDomicilios/{id}")
    public ResponseEntity<ClienteDto> removerDomicilios(@RequestParam List<Long> domiciliosIds, @PathVariable Long id){
        logger.info("INICIO REMOVER DOMICILIOS A CLIENTE");
        return ResponseEntity.ok(facade.removerDomicilios(id,domiciliosIds));
    }

    @PutMapping("/asignarPedidos/{id}")
    public ResponseEntity<ClienteDto> asignarPedidos(@RequestParam List<Long> pedidosIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR PEDIDOS A CLIENTE");
        return ResponseEntity.ok(facade.asignarPedidos(id,pedidosIds));
    }

    @PutMapping("/removerPedidos/{id}")
    public ResponseEntity<ClienteDto> removerPedidos(@RequestParam List<Long> pedidosIds, @PathVariable Long id){
        logger.info("INICIO REMOVER PEDIDOS A CLIENTE");
        return ResponseEntity.ok(facade.removerPedidos(id,pedidosIds));
    }

}
