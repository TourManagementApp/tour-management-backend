package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.model.enums.OrderStatusEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
public class OrderDTO extends BaseDTO {

    private UserDTO user;
    private OrderStatusEnum orderStatus;
    private TourDTO tour;
    private List<PersonDTO> personList;
    private BigDecimal totalPrice;

}
