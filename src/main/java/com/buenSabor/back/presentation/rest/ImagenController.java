package com.buenSabor.back.presentation.rest;

import com.buenSabor.back.business.facade.impl.ImagenFacadeImpl;
import com.buenSabor.back.domain.dtos.ImagenDto;
import com.buenSabor.back.domain.entities.Imagen;
import com.buenSabor.back.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseControllerImpl<Imagen, ImagenDto,Long, ImagenFacadeImpl> {
    public ImagenController(ImagenFacadeImpl facade) {
        super(facade);
    }
}
