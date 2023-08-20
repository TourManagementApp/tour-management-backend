package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Table
@Entity
@Data
public class InvoiceEntity extends BaseEntity {

    @Column(unique = true)
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

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "invoice")
    private OrderEntity order;
}
