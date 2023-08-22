package com.allianz.tourmanagement.database.controller;
import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.database.repository.CityRepository;
import com.allianz.tourmanagement.mapper.CityMapper;
import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.model.requestDTO.CityRequestDTO;
import com.allianz.tourmanagement.service.CityService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController extends BaseController <CityEntity,
        CityDTO,
        CityRequestDTO,
        CityMapper,
        CityRepository,
        CityService>{
    @Autowired
    CityService cityService;
    @Override
    protected CityService getService() {
        return cityService;
    }
}
