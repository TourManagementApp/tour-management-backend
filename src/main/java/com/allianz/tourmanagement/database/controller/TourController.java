package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.database.repository.TourRepository;
import com.allianz.tourmanagement.mapper.TourMapper;
import com.allianz.tourmanagement.model.TourDTO;
import com.allianz.tourmanagement.model.requestDTO.TourRequestDTO;
import com.allianz.tourmanagement.service.TourService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tour")
public class TourController extends BaseController<
        TourEntity,
        TourDTO,
        TourRequestDTO,
        TourMapper,
        TourRepository,
        TourService> {

    @Autowired
    private TourService tourService;

    @Override
    protected TourService getService() {
        return tourService;
    }
}
