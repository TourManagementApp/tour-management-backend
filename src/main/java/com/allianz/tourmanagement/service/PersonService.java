package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.PersonEntity;
import com.allianz.tourmanagement.database.repository.PersonRepository;
import com.allianz.tourmanagement.mapper.PersonMapper;
import com.allianz.tourmanagement.model.PersonDTO;
import com.allianz.tourmanagement.model.requestDTO.PersonRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<PersonEntity, PersonDTO, PersonRequestDTO,
        PersonMapper, PersonRepository> {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonMapper personMapper;

    @Override
    protected PersonMapper getMapper() {
        return personMapper;
    }

    @Override
    protected PersonRepository getRepository() {
        return personRepository;
    }
}
