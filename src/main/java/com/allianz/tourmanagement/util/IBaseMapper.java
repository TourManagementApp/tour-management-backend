package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.MappedSuperclass;

import java.util.List;

@MappedSuperclass
public interface IBaseMapper<Entity extends BaseEntity,
        DTO extends BaseDTO, RequestDTO extends BaseDTO> {

    Entity dtoToEntity(DTO dto);

    DTO entityToDto(Entity entity);

    Entity requestDtoToEntity(RequestDTO requestDTO);

    RequestDTO entityToRequestDto(Entity entity);

    List<Entity> requestDtoListToEntityList(List<RequestDTO> dtoList);

    List<RequestDTO> entityListToRequestDtoList(List<Entity> entityList);

    List<Entity> dtoListToEntityList(List<DTO> dtoList);

    List<DTO> entityListToDtoList(List<Entity> entityList);

    Entity requestDtoToExistEntity(Entity entity, RequestDTO requestDTO);

}
