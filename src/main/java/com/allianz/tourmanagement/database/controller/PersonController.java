package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.PersonEntity;
import com.allianz.tourmanagement.database.repository.PersonRepository;
import com.allianz.tourmanagement.mapper.PersonMapper;
import com.allianz.tourmanagement.model.PersonDTO;
import com.allianz.tourmanagement.model.requestDTO.PersonRequestDTO;
import com.allianz.tourmanagement.service.PersonService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController extends BaseController<PersonEntity, PersonDTO, PersonRequestDTO,
        PersonMapper, PersonRepository, PersonService> {

    @Autowired
    private PersonService personService;

    @Override
    protected PersonService getService() {
        return personService;
    }
}
