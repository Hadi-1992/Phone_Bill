package com.example.phone_bill.repositories;

import com.example.phone_bill.entities.CustomerBill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerBillRepository extends JpaRepository<CustomerBill,Long> {
    CustomerBill findByMobileNum (Long num);
}
