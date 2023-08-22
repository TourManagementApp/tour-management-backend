package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.database.repository.CityRepository;
import com.allianz.tourmanagement.mapper.CityMapper;
import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.model.requestDTO.CityRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService extends BaseService<CityEntity,
        CityDTO,
        CityRequestDTO,
        CityMapper,
        CityRepository> {
    @Autowired
    CityMapper cityMapper;
   @Autowired
   CityRepository cityRepository;
    @Override
    protected CityMapper getMapper() {
        return cityMapper;
    }

    @Override
    protected CityRepository getRepository() {
        return cityRepository;
    }
}
