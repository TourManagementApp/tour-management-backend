package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryRequestDTO extends BaseDTO {
    private String name;
    private List<CityEntity> cityList;
}
