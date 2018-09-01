package com.bibo.backendapp;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RetailerRepository extends Repository<Retailer, Integer> {

    void delete(Retailer retailer);

    List findAll();


    Retailer save(Retailer retailer);

    Retailer findOne(int id);
}
