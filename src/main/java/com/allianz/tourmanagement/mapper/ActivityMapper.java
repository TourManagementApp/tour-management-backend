package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.ActivityEntity;
import com.allianz.tourmanagement.model.ActivityDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper extends BaseMapper<ActivityEntity, ActivityDTO> {
}
