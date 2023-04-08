package com.example.phone_bill.entities.converter;

import com.example.phone_bill.entities.CustomerBill;
import com.example.phone_bill.entities.dto.CustomerBillDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerBillConverter extends AbstractConverter<CustomerBill, CustomerBillDto> {
}
