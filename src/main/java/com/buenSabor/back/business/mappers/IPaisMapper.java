package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.PaisDto;
import com.buenSabor.back.domain.entities.Pais;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPaisMapper extends IBaseMapper<Pais, PaisDto> {
    PaisDto toDTO(Pais source);
    Pais toEntity(PaisDto source);
    List<PaisDto> toDTOsList(List<Pais> source);
    List<Pais> toEntitiesList(List<PaisDto> source);
}
