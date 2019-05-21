package com.salon.controller.staffController;

import com.salon.domain.staff.Cleaners;
import com.salon.factory.staffFactory.CleanersFactory;
import com.salon.service.Impl.staffServiceImpl.CleanersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/Cleaners")
public class CleanersController {

    @Autowired
    private CleanersServiceImpl cleanersService;

    @GetMapping("/create{name}")
    public @ResponseBody
    Cleaners create(@PathVariable String name, int num){
        Cleaners cleaners = CleanersFactory.getCleaners(name,num);
        return cleanersService.create(cleaners);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Cleaners> getAll(){
        return cleanersService.getAll();
    }
}
