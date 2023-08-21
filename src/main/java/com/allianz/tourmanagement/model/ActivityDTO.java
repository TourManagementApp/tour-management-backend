package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.database.entity.StopEntity;
import com.allianz.tourmanagement.model.enums.ActivityTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class ActivityDTO extends BaseDTO {

    private String name;

    private List<ActivityTypeEnum> activityTypeList;

    @JsonIgnore
    private List<StopEntity> stopList;

}
