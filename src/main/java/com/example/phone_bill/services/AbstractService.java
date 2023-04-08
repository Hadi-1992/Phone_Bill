package com.example.phone_bill.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public class AbstractService<R extends JpaRepository<E, Long>, E> {
    @Autowired
    protected R repo;

    public void insert(E e) {
        repo.save(e);

    }

}
