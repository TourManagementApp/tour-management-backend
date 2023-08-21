package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StopRequestDTO extends BaseDTO {

    private CityRequestDTO city;
    private Date arrivalDate;
    private Date departureDate;
    private HotelRequestDTO hotel;
    private List<ActivityRequestDTO> activityList;
    private List<TourEntity> tourList;

}
