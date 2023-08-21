package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.database.entity.HotelEntity;
import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CityDTO extends BaseDTO {

    private String name;
    private CountryDTO country;
    private List<StopEntity> stopList;
    private List<HotelEntity> hotelList;

}
