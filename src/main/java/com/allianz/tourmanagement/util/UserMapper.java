package com.allianz.tourmanagement.util;

import com.allianz.tourmanagement.database.entity.UserEntity;
import com.allianz.tourmanagement.model.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<UserEntity, UserDTO> {

}
