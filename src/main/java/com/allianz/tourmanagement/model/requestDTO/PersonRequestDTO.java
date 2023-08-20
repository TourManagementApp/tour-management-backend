package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.model.enums.PersonTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PersonRequestDTO extends BaseDTO {

    private String name;
    private String surname;
    private Date birthDate;
    private int identityNumber;
    private PersonTypeEnum personType;

}
