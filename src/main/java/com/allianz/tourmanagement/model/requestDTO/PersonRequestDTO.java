package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.model.enums.PersonTypeEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PersonRequestDTO extends BaseRequestDTO {

    private String name;
    private String surname;
    private Date birthDate;
    private int identityNumber;
    private PersonTypeEnum personType;

}
