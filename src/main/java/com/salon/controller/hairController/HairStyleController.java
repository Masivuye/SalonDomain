package com.salon.controller.hairController;


import com.salon.domain.hair.HairStyle;
import com.salon.factory.hairFactory.HairStyleFactory;
import com.salon.serviceImpl.hairServiceImpl.HairStyleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/HairStyle")
public class HairStyleController {

    @Autowired
    private HairStyleServiceImpl hairStylerService;

    @GetMapping("/create{types}")
    public @ResponseBody
    HairStyle create(@PathVariable String[] types,double price){
        HairStyle hairStyle = HairStyleFactory.getHairStyle(types,price);
        return hairStylerService.create(hairStyle);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<HairStyle> getAll(){
        return hairStylerService.getAll();
    }

}
