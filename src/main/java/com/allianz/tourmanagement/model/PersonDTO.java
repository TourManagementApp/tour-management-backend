package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PersonDTO extends BaseDTO {

    private String name;
    private String surname;
    private Date birthDate;
    private int identityNumber;

}
