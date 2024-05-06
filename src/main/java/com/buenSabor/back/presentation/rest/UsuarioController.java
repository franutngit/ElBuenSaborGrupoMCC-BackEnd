package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.UsuarioFacadeImpl;
import com.buenSabor.back.domain.dtos.UsuarioDto;
import com.buenSabor.back.domain.entities.Usuario;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioDto,Long, UsuarioFacadeImpl> {
    public UsuarioController(UsuarioFacadeImpl facade) {
        super(facade);
    }

}
