package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.PromocionDto;
import com.buenSabor.back.domain.entities.Promocion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPromocionMapper extends IBaseMapper<Promocion, PromocionDto> {

    PromocionDto toDTO(Promocion source);
    Promocion toEntity(PromocionDto source);
    List<PromocionDto> toDTOsList(List<Promocion> source);
    List<Promocion> toEntitiesList(List<PromocionDto> source);
}
