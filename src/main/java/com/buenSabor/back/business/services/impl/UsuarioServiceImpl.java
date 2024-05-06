package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.IUsuarioService;
import com.buenSabor.back.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements IUsuarioService {
}
