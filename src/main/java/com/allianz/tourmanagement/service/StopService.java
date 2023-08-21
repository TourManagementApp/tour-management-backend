package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.database.repository.StopRepository;
import com.allianz.tourmanagement.mapper.StopMapper;
import com.allianz.tourmanagement.model.StopDTO;
import com.allianz.tourmanagement.model.requestDTO.StopRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StopService extends BaseService<StopEntity, StopDTO, StopRequestDTO,
        StopMapper, StopRepository> {

    @Autowired
    StopMapper stopMapper;

    @Autowired
    StopRepository stopRepository;

    @Override
    protected StopMapper getMapper() {
        return stopMapper;
    }

    @Override
    protected StopRepository getRepository() {
        return stopRepository;
    }
}
