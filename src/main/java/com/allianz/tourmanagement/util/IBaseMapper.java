package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.MappedSuperclass;

import java.util.List;

@MappedSuperclass
public interface BaseMapper<Entity extends BaseEntity,
        DTO extends BaseDTO> {

    Entity dtoToEntity(DTO dto);
    DTO entityToDto(Entity entity);
    List<Entity> dtoListToEntityList(List<DTO> dtoList);
    List<DTO> entityListToDtoList(List<Entity> entityList);

}
