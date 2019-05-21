package com.salon.controller.hairController;

import com.salon.domain.hair.GirlsHair;
import com.salon.factory.hairFactory.GirlsHairFactory;
import com.salon.serviceImpl.hairServiceImpl.GirlsHairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/GirlsHair")
public class GirlsHairController {

    @Autowired
    private GirlsHairServiceImpl girlsHairService;


    @GetMapping("/create{types}")
    public @ResponseBody
    GirlsHair create(@PathVariable String[] types,double price){
        GirlsHair girlsHair = GirlsHairFactory.getGirlsHair(types,price);
        return girlsHairService.create(girlsHair);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public Set<GirlsHair> getAll(){
        return girlsHairService.getAll();
    }
}
