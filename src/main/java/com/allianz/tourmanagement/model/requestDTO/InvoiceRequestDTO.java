package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.util.BaseDTO;
import com.allianz.tourmanagement.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class InvoiceRequestDTO extends BaseRequestDTO {
    private String billNo;
    private LocalDateTime billDate;
    private BigDecimal taxRate;
    private BigDecimal taxAmount;
    private BigDecimal totalSellNetPrice;
    private BigDecimal totalSellPrice;
    private OrderRequestDTO order;
}
