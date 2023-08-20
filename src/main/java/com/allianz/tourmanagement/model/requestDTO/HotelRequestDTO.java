package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

@Data
public class HotelRequestDTO extends BaseDTO {
    private String name;
    private CityRequestDTO city;
}
