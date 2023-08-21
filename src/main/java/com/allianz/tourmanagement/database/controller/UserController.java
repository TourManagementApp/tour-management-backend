package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.UserEntity;
import com.allianz.tourmanagement.database.repository.UserRepository;
import com.allianz.tourmanagement.mapper.UserMapper;
import com.allianz.tourmanagement.model.UserDTO;
import com.allianz.tourmanagement.model.requestDTO.UserRequestDTO;
import com.allianz.tourmanagement.service.UserService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<
        UserEntity,
        UserDTO,
        UserRequestDTO,
        UserMapper,
        UserRepository,
        UserService> {

    @Autowired
    private UserService userService;

    @Override
    protected UserService getService() {
        return userService;
    }
}
