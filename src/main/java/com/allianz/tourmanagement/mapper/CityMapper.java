package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.model.requestDTO.CityRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper extends IBaseMapper<CityEntity, CityDTO, CityRequestDTO> {
}
