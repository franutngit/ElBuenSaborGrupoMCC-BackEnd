package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.IArticuloInsumoService;
import com.buenSabor.back.business.services.IImagenService;
import com.buenSabor.back.business.services.IUnidadMedidaService;
import com.buenSabor.back.domain.entities.ArticuloInsumo;
import com.buenSabor.back.domain.entities.Imagen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo,Long> implements IArticuloInsumoService {

    @Autowired
    private IImagenService imagenService;
    @Autowired
    private IUnidadMedidaService unidadMedidaService;

    @Override
    public ArticuloInsumo asignarImagenes(Long id, List<Long> imagenesIds) {
        var articulo = getById(id);
        var imagenes = imagenService.getAll().stream()
                .filter(imagen -> imagenesIds.contains(imagen.getId()))
                .collect(Collectors.toList());
        imagenes.forEach(imagen -> articulo.getImagenes().add(imagen));
        return update(articulo);
    }

    @Override
    public ArticuloInsumo removerImagenes(Long id, List<Long> imagenesIds) {
        var articulo = getById(id);
        var tempSet = new HashSet<Imagen>();
        articulo.getImagenes().forEach(imagen -> {
            if(imagenesIds.contains(imagen.getId())){
                tempSet.add(imagen);
            }
        });
        articulo.getImagenes().removeAll(tempSet);
        return update(articulo);
    }

    @Override
    public ArticuloInsumo asignarUnidadMedida(Long id, Long unidadMedidaId) {
        var articulo = getById(id);
        var unidadMedida = unidadMedidaService.getById(unidadMedidaId);
        articulo.setUnidadMedida(unidadMedida);
        return update(articulo);
    }

}
