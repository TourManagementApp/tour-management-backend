package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.database.repository.TourRepository;
import com.allianz.tourmanagement.mapper.TourMapper;
import com.allianz.tourmanagement.model.TourDTO;
import com.allianz.tourmanagement.model.requestDTO.TourRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService extends BaseService<TourEntity, TourDTO, TourRequestDTO,
        TourMapper, TourRepository> {

    @Autowired
    TourMapper tourMapper;

    @Autowired
    TourRepository tourRepository;

    @Override
    protected TourMapper getMapper() {
        return tourMapper;
    }

    @Override
    protected TourRepository getRepository() {
        return tourRepository;
    }
}
