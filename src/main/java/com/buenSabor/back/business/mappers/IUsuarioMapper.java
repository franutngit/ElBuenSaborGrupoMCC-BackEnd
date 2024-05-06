package com.buenSabor.back.business.mappers;

import com.buenSabor.back.domain.dtos.PedidoDto;
import com.buenSabor.back.domain.dtos.UsuarioDto;
import com.buenSabor.back.domain.entities.Pedido;
import com.buenSabor.back.domain.entities.Usuario;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUsuarioMapper extends IBaseMapper<Usuario, UsuarioDto> {
    UsuarioDto toDTO(Usuario source);
    Usuario toEntity(UsuarioDto source);
    List<UsuarioDto> toDTOsList(List<Usuario> source);
    List<Usuario> toEntitiesList(List<UsuarioDto> source);
}
