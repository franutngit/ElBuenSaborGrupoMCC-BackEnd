package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.PedidoDto;
import com.buenSabor.back.domain.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IPedidoMapper extends IBaseMapper<Pedido,PedidoDto> {

    PedidoDto toDTO(Pedido source);
    Pedido toEntity(PedidoDto source);
    List<PedidoDto> toDTOsList(List<Pedido> source);
    List<Pedido> toEntitiesList(List<PedidoDto> source);
}
