package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.CountryEntity;
import com.allianz.tourmanagement.model.CountryDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryMapper extends BaseMapper<CountryEntity, CountryDTO> {
}
