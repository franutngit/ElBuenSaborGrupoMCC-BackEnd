package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.ClienteDto;
import com.buenSabor.back.domain.entities.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapper extends IBaseMapper<Cliente, ClienteDto> {

    ClienteDto toDTO(Cliente source);
    Cliente toEntity(ClienteDto source);
    List<ClienteDto> toDTOsList(List<Cliente> source);
    List<Cliente> toEntitiesList(List<ClienteDto> source);
}
