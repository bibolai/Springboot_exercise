package com.bibo.backendapp;

import java.util.List;

public interface RetailerService {

     Retailer create(Retailer retailer);

     Retailer delete(int id);

     List<Retailer> fineAll();

     Retailer findById(int id);

     Retailer update(Retailer retailer);
}
