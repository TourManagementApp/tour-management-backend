package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.CountryEntity;
import com.allianz.tourmanagement.database.repository.CountryRepository;
import com.allianz.tourmanagement.mapper.CountryMapper;
import com.allianz.tourmanagement.model.CountryDTO;
import com.allianz.tourmanagement.model.requestDTO.CountryRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<CountryEntity,
        CountryDTO,
        CountryRequestDTO,
        CountryMapper,
        CountryRepository> {
    @Autowired
    CountryMapper countryMapper;
    @Autowired
    CountryRepository countryRepository;
    @Override
    protected CountryMapper getMapper() {
        return null;
    }

    @Override
    protected CountryRepository getRepository() {
        return null;
    }
}
