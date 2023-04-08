package com.example.phone_bill.controllers;

import com.example.phone_bill.entities.converter.AbstractConverter;
import com.example.phone_bill.services.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AbstractController<S extends AbstractService<? extends JpaRepository<E, Long>, E>, E, D> {
    @Autowired
    protected S service;
    @Autowired
    protected AbstractConverter<E, D> abstractConverter;

    @PostMapping()
    public void add(@RequestBody D d) {
        service.insert(abstractConverter.convertDto(d));
    }
}
