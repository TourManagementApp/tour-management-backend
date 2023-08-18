package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.model.enums.TourSeasonEnum;
import com.allianz.tourmanagement.model.enums.TourTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TourDTO extends BaseDTO {

private CityDTO depaartingCity;
private CityDTO arrivingCity;
private CityDTO returningCity;
private Date starDate;
private Date endDate;
private BigDecimal price;
private int capacity;
private TourSeasonEnum tourSeason;
private TourTypeEnum tourType;
private ItineraryDTO itinerary;


}
