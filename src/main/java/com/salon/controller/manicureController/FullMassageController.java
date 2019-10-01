package com.salon.controller.manicureController;

import com.salon.domain.manicure.FullMassage;
import com.salon.factory.manicureFactory.FullMassageFactory;
import com.salon.service.Impl.manicureServiceImpl.FullMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/salon/FullMassage")
public class FullMassageController {

    @Autowired
    private FullMassageServiceImpl fullMassageService;


    @GetMapping("/create{price}")
    public @ResponseBody
    FullMassage create(@PathVariable double price){
        FullMassage fullMassage = FullMassageFactory.getFullMassage(price);
        return fullMassageService.create(fullMassage);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<FullMassage> getAll(){
        return  fullMassageService.getAll();
    }
}
