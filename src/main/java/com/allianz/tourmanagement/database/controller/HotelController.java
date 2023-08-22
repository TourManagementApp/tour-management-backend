package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.HotelEntity;
import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.database.repository.HotelRepository;
import com.allianz.tourmanagement.database.repository.OrderRepository;
import com.allianz.tourmanagement.mapper.HotelMapper;
import com.allianz.tourmanagement.mapper.OrderMapper;
import com.allianz.tourmanagement.model.HotelDTO;
import com.allianz.tourmanagement.model.OrderDTO;
import com.allianz.tourmanagement.model.requestDTO.HotelRequestDTO;
import com.allianz.tourmanagement.model.requestDTO.OrderRequestDTO;
import com.allianz.tourmanagement.service.HotelService;
import com.allianz.tourmanagement.service.OrderService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController extends BaseController<
        HotelEntity,
        HotelDTO,
        HotelRequestDTO,
        HotelMapper,
        HotelRepository,
        HotelService> {

    @Autowired
    HotelService hotelService;
    @Override
    protected HotelService getService() {
        return hotelService;
    }
}
