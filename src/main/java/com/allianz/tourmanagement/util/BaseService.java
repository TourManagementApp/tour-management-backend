package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;

import java.util.UUID;

public abstract class BaseService<Entity extends BaseEntity,
        DTO extends BaseDTO, RequestDTO extends BaseDTO,
        Mapper extends IBaseMapper<Entity, DTO, RequestDTO>,
        Repository extends IBaseRepository<Entity>> {

    protected abstract Mapper getMapper();

    protected abstract Repository getRepository();


    public DTO save(RequestDTO requestDTO) {
        Entity entity = getMapper().requestDtoToEntity(requestDTO);
        getRepository().save(entity);
        return getMapper().entityToDto(entity);
    }

    public DTO update(UUID uuid, RequestDTO requestDTO) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            entity = getMapper().requestDtoToExistEntity(entity, requestDTO);
            getRepository().save(entity);
            return getMapper().entityToDto(entity);
        } else {
            return null;
        }
    }

    public DTO getByUUID(UUID uuid) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            return getMapper().entityToDto(entity);
        } else {
            return null;
        }
    }

    public Boolean deleteByUUID(UUID uuid) {
        Entity entity = getRepository().findByUuid(uuid).orElse(null);
        if (entity != null) {
            getRepository().delete(entity);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
