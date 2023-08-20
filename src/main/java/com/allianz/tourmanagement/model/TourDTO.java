package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.model.enums.TourSeasonEnum;
import com.allianz.tourmanagement.model.enums.TourTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class TourDTO extends BaseDTO {

private CityDTO departingCity;
private CityDTO arrivingCity;
private CityDTO returningCity;
private Date startDate;
private Date endDate;
private BigDecimal price;
private int capacity;
private TourSeasonEnum tourSeason;
private TourTypeEnum tourType;
private List<StopDTO> stopList;


}
