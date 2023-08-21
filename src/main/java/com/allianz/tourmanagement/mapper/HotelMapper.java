package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.HotelEntity;
import com.allianz.tourmanagement.model.HotelDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper extends BaseMapper<HotelEntity, HotelDTO> {
}
