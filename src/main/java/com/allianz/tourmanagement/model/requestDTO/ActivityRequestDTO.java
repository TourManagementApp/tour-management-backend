package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.model.enums.ActivityTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

import java.util.List;

@Data
public class ActivityRequestDTO extends BaseRequestDTO {

    private String name;
    private List<ActivityTypeEnum> activityTypeList;

}
