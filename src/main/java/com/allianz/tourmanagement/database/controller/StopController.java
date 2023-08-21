package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.database.repository.StopRepository;
import com.allianz.tourmanagement.mapper.StopMapper;
import com.allianz.tourmanagement.model.StopDTO;
import com.allianz.tourmanagement.model.requestDTO.StopRequestDTO;
import com.allianz.tourmanagement.service.StopService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stop")
public class StopController extends BaseController<StopEntity, StopDTO, StopRequestDTO,
        StopMapper, StopRepository, StopService> {

    @Autowired
    private StopService stopService;

    @Override
    protected StopService getService() {
        return stopService;
    }
}
