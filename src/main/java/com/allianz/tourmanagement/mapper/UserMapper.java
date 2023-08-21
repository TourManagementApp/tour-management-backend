package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.UserEntity;
import com.allianz.tourmanagement.model.UserDTO;
import com.allianz.tourmanagement.model.requestDTO.UserRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends IBaseMapper<UserEntity, UserDTO, UserRequestDTO> {

}
