package com.bibo.backendapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetailerServiceImpl implements RetailerService{

    @Autowired
    private RetailerRepository retailerRepository;

    @Override
    public Retailer create(Retailer retailer){

        return retailerRepository.save(retailer);
    }

    @Override
    public Retailer delete(int id){
        Retailer re = findById(id);
        if(null!=re) {
            retailerRepository.delete(re);
        }
        return re;
    }

    @Override
    public List<Retailer> fineAll(){
        return retailerRepository.findAll();
    }

    @Override
    public Retailer findById(int id){
        return retailerRepository.findOne(id);
        //return null;
    }

    @Override
    public Retailer update(Retailer retailer){
        return null;
    }
}
