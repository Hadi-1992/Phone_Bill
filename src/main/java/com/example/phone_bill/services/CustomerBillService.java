package com.example.phone_bill.services;

import com.example.phone_bill.entities.CustomerBill;
import com.example.phone_bill.repositories.CustomerBillRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerBillService extends AbstractService<CustomerBillRepository, CustomerBill> {

    public CustomerBill getBill(Long num){
        return repo.findByMobileNum(num);

    }
}
