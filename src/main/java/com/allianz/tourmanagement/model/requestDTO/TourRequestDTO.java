package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.model.enums.TourSeasonEnum;
import com.allianz.tourmanagement.model.enums.TourTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class TourRequestDTO extends BaseDTO {

private CityRequestDTO departingCity;
private CityRequestDTO arrivingCity;
private CityRequestDTO returningCity;
private Date startDate;
private Date endDate;
private BigDecimal price;
private int capacity;
private TourSeasonEnum tourSeason;
private TourTypeEnum tourType;
private List<StopRequestDTO> stopList;
    private List<OrderEntity> orderList;



}
