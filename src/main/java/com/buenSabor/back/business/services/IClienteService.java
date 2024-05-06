package com.buenSabor.back.business.services;

import com.buenSabor.back.domain.entities.Cliente;

import java.util.List;

public interface IClienteService extends IBaseService<Cliente,Long>{

    Cliente asignarUsuario(Long id, Long idUsuario);
    Cliente asignarImagen(Long id, Long idImagen);
    Cliente asignarPedidos(Long id, List<Long> pedidosIds);
    Cliente removerPedidos(Long id, List<Long> pedidosIds);
    Cliente asignarDomicilios(Long id, List<Long> domiciliosIds);
    Cliente removerDomicilios(Long id, List<Long> domiciliosIds);
}
