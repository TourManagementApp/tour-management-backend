package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.ActivityEntity;
import com.allianz.tourmanagement.database.repository.ActivityRepository;
import com.allianz.tourmanagement.mapper.ActivityMapper;
import com.allianz.tourmanagement.model.ActivityDTO;
import com.allianz.tourmanagement.model.requestDTO.ActivityRequestDTO;
import com.allianz.tourmanagement.service.ActivityService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController extends BaseController<
        ActivityEntity,
        ActivityDTO,
        ActivityRequestDTO,
        ActivityMapper,
        ActivityRepository,
        ActivityService> {
    @Autowired
    private ActivityService activityService;

    @Override
    protected ActivityService getService() {
        return activityService;
    }
}
