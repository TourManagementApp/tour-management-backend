package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

@Data
public class HotelDTO extends BaseDTO {
    private String name;
    private CityDTO city;
}
