package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StopDTO extends BaseDTO {

    private CityDTO city;
    private Date arrivalDate;
    private Date departureDate;
    private HotelDTO hotel;
    @JsonIgnore
    private List<ActivityDTO> activityList;
    @JsonIgnore
    private List<TourEntity> tourList;

}
