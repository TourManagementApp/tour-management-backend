package com.allianz.tourmanagement.service;

import ch.qos.logback.core.joran.action.BaseModelAction;
import com.allianz.tourmanagement.database.entity.HotelEntity;
import com.allianz.tourmanagement.database.repository.HotelRepository;
import com.allianz.tourmanagement.mapper.HotelMapper;
import com.allianz.tourmanagement.model.HotelDTO;
import com.allianz.tourmanagement.model.requestDTO.HotelRequestDTO;
import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends BaseService<HotelEntity,
        HotelDTO,
        HotelRequestDTO ,
        HotelMapper,
        HotelRepository
        > {
    @Autowired
    HotelMapper hotelMapper;
    @Autowired
    HotelRepository hotelRepository;

    @Override
    protected HotelMapper getMapper() {
        return hotelMapper;
    }

    @Override
    protected HotelRepository getRepository() {
        return hotelRepository;
    }
}
