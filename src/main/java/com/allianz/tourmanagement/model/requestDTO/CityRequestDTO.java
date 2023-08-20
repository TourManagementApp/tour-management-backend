package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

@Data
public class CityRequestDTO extends BaseDTO {

    private String name;
    private CountryRequestDTO country;

}
