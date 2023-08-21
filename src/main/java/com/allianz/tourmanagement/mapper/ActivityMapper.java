package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.ActivityEntity;
import com.allianz.tourmanagement.model.ActivityDTO;
import com.allianz.tourmanagement.model.requestDTO.ActivityRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper extends IBaseMapper<ActivityEntity, ActivityDTO, ActivityRequestDTO> {
}
