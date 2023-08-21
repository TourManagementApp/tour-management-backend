package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

@Data
public class CityRequestDTO extends BaseRequestDTO {

    private String name;
    private CountryRequestDTO country;

}
