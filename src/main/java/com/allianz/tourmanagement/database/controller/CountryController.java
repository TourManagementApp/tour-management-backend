package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.CountryEntity;
import com.allianz.tourmanagement.database.repository.CountryRepository;
import com.allianz.tourmanagement.mapper.CountryMapper;
import com.allianz.tourmanagement.model.CountryDTO;
import com.allianz.tourmanagement.model.requestDTO.CountryRequestDTO;
import com.allianz.tourmanagement.service.CountryService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController extends BaseController<CountryEntity,
        CountryDTO,
        CountryRequestDTO,
        CountryMapper,
        CountryRepository,
        CountryService> {
    @Autowired
    CountryService countryService;

    @Override
    protected CountryService getService() {
        return null;
    }
}

