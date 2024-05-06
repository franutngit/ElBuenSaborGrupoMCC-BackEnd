package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.IImagenFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.dtos.ImagenDto;
import com.buenSabor.back.domain.entities.Imagen;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImpl extends BaseFacadeImpl<Imagen, ImagenDto,Long> implements IImagenFacade {
    public ImagenFacadeImpl(IBaseService<Imagen, Long> baseService, IBaseMapper<Imagen, ImagenDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
