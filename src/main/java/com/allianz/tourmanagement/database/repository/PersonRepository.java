package com.allianz.tourmanagement.database.repository;

import com.allianz.tourmanagement.database.entity.PersonEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends IBaseRepository<PersonEntity> {
}
