package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.model.TourDTO;
import com.allianz.tourmanagement.model.requestDTO.TourRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TourMapper extends IBaseMapper<TourEntity, TourDTO, TourRequestDTO> {
}
