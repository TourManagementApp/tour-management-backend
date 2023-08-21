package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.PersonEntity;
import com.allianz.tourmanagement.model.PersonDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<PersonEntity, PersonDTO> {
}
