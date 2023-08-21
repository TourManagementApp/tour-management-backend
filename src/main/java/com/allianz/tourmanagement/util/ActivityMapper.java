package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.database.entity.ActivityEntity;
import com.allianz.tourmanagement.model.ActivityDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityMapper extends BaseMapper<ActivityEntity, ActivityDTO> {
}
