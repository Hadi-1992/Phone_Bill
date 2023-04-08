package com.example.phone_bill.entities.converter;

public interface AbstractConverter<E, D> {
    D convertEntity(E e);

    E convertDto(D d);
}
