package com.allianz.tourmanagement.model;

import lombok.Data;

import java.util.List;

@Data
public class ItineraryDTO {

    private int stopNumber;
    private List<StopDTO> stopList;

}
