package com.buenSabor.back.presentation.rest.base;

import com.buenSabor.back.domain.dtos.BaseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseController <D extends BaseDto, ID extends Serializable>{
    ResponseEntity<D> getById(ID id);
    ResponseEntity<List<D>> getAll();
    ResponseEntity<D> create(D entity);
    ResponseEntity<D> edit(D entity, ID id);
    ResponseEntity<?> deleteById(ID id);
}

