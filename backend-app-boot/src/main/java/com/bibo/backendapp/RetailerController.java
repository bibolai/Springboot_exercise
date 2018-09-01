package com.bibo.backendapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/retailers"})
public class RetailerController {

    @Autowired
    private RetailerService retailerService;

    @PostMapping
    public Retailer create(@RequestBody Retailer retailer ){
        return retailerService.create(retailer);
    }

    @GetMapping(path="/{id}")
    public Retailer find(@PathVariable("id") int id){

        return retailerService.findById(id);
    }

    @PutMapping
    public Retailer update(@RequestBody Retailer retailer){
        return retailerService.update(retailer);
    }

    @DeleteMapping(path ={"/{id}"})
    public Retailer delete(@PathVariable("id") int id) {
        return retailerService.delete(id);
    }

    @GetMapping
    public List findAll(){
        System.out.println("bibo");
        //return retailerService.fineAll();
        return null;
    }
}
