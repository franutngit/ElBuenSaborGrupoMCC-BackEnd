package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IUsuarioFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.UsuarioDto;
import com.buenSabor.back.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImpl extends BaseFacadeImpl<Usuario, UsuarioDto,Long> implements IUsuarioFacade {

    public UsuarioFacadeImpl(IBaseService<Usuario, Long> baseService, IBaseMapper<Usuario,UsuarioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
