package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.HotelEntity;
import com.allianz.tourmanagement.model.HotelDTO;
import com.allianz.tourmanagement.model.requestDTO.HotelRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HotelMapper extends IBaseMapper<HotelEntity, HotelDTO, HotelRequestDTO> {
}
