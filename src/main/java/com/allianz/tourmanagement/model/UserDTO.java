package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class UserDTO extends BaseDTO {

    private String name;
    private String surname;
    private String email;
    private Date birthDate;
    private String cardNo;
    private CountryDTO country;

}
