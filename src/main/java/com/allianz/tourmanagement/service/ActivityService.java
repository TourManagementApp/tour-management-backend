package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.ActivityEntity;
import com.allianz.tourmanagement.database.repository.ActivityRepository;
import com.allianz.tourmanagement.mapper.ActivityMapper;
import com.allianz.tourmanagement.model.ActivityDTO;
import com.allianz.tourmanagement.model.requestDTO.ActivityRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService extends BaseService<ActivityEntity, ActivityDTO, ActivityRequestDTO,
        ActivityMapper, ActivityRepository> {

    @Autowired
    ActivityMapper activityMapper;

    @Autowired
    ActivityRepository activityRepository;

    @Override
    protected ActivityMapper getMapper() {
        return activityMapper;
    }

    @Override
    protected ActivityRepository getRepository() {
        return activityRepository;
    }
}
