package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.model.StopDTO;
import com.allianz.tourmanagement.model.requestDTO.StopRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StopMapper extends IBaseMapper<StopEntity, StopDTO, StopRequestDTO> {
}
