package com.example.phone_bill.controllers;

import com.example.phone_bill.entities.CustomerBill;
import com.example.phone_bill.entities.dto.CustomerBillDto;
import com.example.phone_bill.services.CustomerBillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class CustomerBillController extends AbstractController<CustomerBillService, CustomerBill, CustomerBillDto> {
   @GetMapping("/{number}")
    public CustomerBillDto getBill(@PathVariable("number") Long num) {
        return abstractConverter.convertEntity(service.getBill(num));
    }
}
