package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.model.StopDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StopMapper extends BaseMapper<StopEntity, StopDTO> {
}
