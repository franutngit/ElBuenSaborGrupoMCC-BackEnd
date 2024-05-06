package com.buenSabor.back.business.facade.impl;

import com.buenSabor.back.business.facade.ICategoriaFacade;
import com.buenSabor.back.business.mappers.IBaseMapper;
import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.business.services.ICategoriaService;
import com.buenSabor.back.domain.dtos.CategoriaDto;
import com.buenSabor.back.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ICategoriaService categoriaService;

    @Override
    public CategoriaDto asignarSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.asignarSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto removerSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.removerSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto asignarArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.asignarArticulos(id,articulosIds));
    }

    @Override
    public CategoriaDto removerArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.removerArticulos(id,articulosIds));
    }

}
