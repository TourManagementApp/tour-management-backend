package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.model.enums.ActivityTypeEnum;
import lombok.Data;

import java.util.List;

@Data
public class ActivityDTO {

    private String name;
    private List<ActivityTypeEnum> activityTypeList;
}
