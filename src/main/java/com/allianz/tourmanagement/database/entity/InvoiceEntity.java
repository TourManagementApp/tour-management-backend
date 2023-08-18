package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.OrderDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Table
@Entity
@Data
public class InvoiceEntity extends BaseEntity {
    @Column
    private String billNo;
    @Column
    private LocalDateTime billDate;
    @Column
    private BigDecimal taxRate;
    @Column
    private BigDecimal taxAmount;
    @Column
    private BigDecimal totalSellNetPrice;
    @Column
    private BigDecimal totalSellPrice;
    @OneToOne
    private OrderEntity orderEntity;
}
