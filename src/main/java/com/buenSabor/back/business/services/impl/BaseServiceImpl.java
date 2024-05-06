package com.buenSabor.back.business.services.impl;

import com.buenSabor.back.business.services.IBaseService;
import com.buenSabor.back.domain.entities.Base;
import com.buenSabor.back.repositories.BaseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public abstract class BaseServiceImpl<E extends Base,ID extends Serializable> implements IBaseService<E, ID> {

    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    protected BaseRepository<E,ID> baseRepository;

    @Override
    public E create(E entity) {
        var newEntity = baseRepository.save(entity);
        logger.info("Creada entidad {}",newEntity);
        return newEntity;
    }

    @Override
    public E getById(ID id) {
        var entity = baseRepository.getById(id);
        logger.info("Obtenida entidad {}",entity);
        return entity;
    }

    @Override
    public List<E> getAll() {
        var entities = baseRepository.getAll();
        logger.info("Obtenidas entidades {}",entities);
        return entities;
    }

    @Override
    public void deleteById(ID id) {
        var entity = getById(id);
        baseRepository.delete(entity);
        logger.info("Borrada logicamente entidad {}",entity);
    }

    @Override
    public E update(E entity) {
        var optionalEntity = baseRepository.findById((ID) entity.getId());
        if (optionalEntity.isEmpty()){
            logger.error("No se encontro una entidad con el id " + entity.getId());
            throw new RuntimeException("No se encontro una entidad con el id " + entity.getId());
        }
        var newEntity = baseRepository.save(entity);
        logger.info("Actualizada entidad {}",newEntity);
        return newEntity;
    }

}
