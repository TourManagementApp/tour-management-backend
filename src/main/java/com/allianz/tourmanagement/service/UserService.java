package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.UserEntity;
import com.allianz.tourmanagement.database.repository.UserRepository;
import com.allianz.tourmanagement.mapper.UserMapper;
import com.allianz.tourmanagement.model.UserDTO;
import com.allianz.tourmanagement.model.requestDTO.UserRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserEntity, UserDTO, UserRequestDTO,
        UserMapper, UserRepository> {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRepository userRepository;

    @Override
    protected UserMapper getMapper() {
        return userMapper;
    }

    @Override
    protected UserRepository getRepository() {
        return userRepository;
    }
}
