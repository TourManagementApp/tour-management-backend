package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper extends BaseMapper<CityEntity, CityDTO> {
}
