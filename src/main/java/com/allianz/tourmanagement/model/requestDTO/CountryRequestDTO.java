package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.database.entity.CityEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class CountryRequestDTO extends BaseRequestDTO {
    private String name;
    private List<CityEntity> cityList;
}
