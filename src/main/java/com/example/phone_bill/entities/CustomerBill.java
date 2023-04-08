package com.example.phone_bill.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CustomerBill extends AbstractEntity {
    private Long payId;
    private Long mobileNum;
    private String customerName;
    private Long dept;
    private Date dueDate;
}
