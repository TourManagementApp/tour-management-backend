package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.model.SortDTO;
import lombok.Data;

import java.util.List;

@Data
public class BaseFilterRequestDTO {
    private int pageNumber;
    private int pageSize;
    private SortDTO sortDTO;
}