package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
public class SortDTO {
    private String columnName;
    private Sort.Direction directionEnum;
}
