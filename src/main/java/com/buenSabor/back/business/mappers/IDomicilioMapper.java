package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.DomicilioDto;
import com.buenSabor.back.domain.entities.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDomicilioMapper extends IBaseMapper<Domicilio, DomicilioDto> {


    DomicilioDto toDTO(Domicilio source);
    Domicilio toEntity(DomicilioDto source);
    List<DomicilioDto> toDTOsList(List<Domicilio> source);
    List<Domicilio> toEntitiesList(List<DomicilioDto> source);
}
