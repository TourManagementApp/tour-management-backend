package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.model.TourDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TourMapper extends BaseMapper<TourEntity, TourDTO> {
}
