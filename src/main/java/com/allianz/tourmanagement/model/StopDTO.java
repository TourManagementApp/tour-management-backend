package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StopDTO extends BaseDTO {

    private CityDTO city;
    private Date arrivalDate;
    private Date departureDate;
    private HotelDTO hotel;
    private List<ActivityDTO> activityList;

}
