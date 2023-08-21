package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

@Data
public class HotelRequestDTO extends BaseRequestDTO {
    private String name;
    private CityRequestDTO city;
}
