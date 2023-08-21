package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.model.enums.ActivityTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class ActivityRequestDTO extends BaseDTO {

    private String name;
    private List<ActivityTypeEnum> activityTypeList;

}
