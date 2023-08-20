package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

@Data
public class CityDTO extends BaseDTO {

    private String name;
    private CountryDTO country;

}
