package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryDTO extends BaseDTO {
    private String name;
    private List<CityEntity> cityList;
}
