package com.salon.controller.staffController;

import com.salon.domain.staff.HairStyler;
import com.salon.factory.staffFactory.HairStylerFactory;
import com.salon.service.Impl.staffServiceImpl.HairStylerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/HairStyler")
public class HairStylerController {

    @Autowired
    private HairStylerServiceImpl hairStylerService;

    @GetMapping("/create{number}")
    public @ResponseBody
    HairStyler create(@PathVariable String name,int number){
       HairStyler hairStyler = HairStylerFactory.getHairStyler(name,number);
       return hairStylerService.create(hairStyler);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<HairStyler> getAll(){
        return (Set<HairStyler>) hairStylerService.getAll();
    }
}
